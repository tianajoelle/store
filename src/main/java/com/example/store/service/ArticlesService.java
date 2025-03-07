package com.example.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.store.model.Articles;
import com.example.store.model.Commande;
import com.example.store.repository.ArticlesRepository;
import com.example.store.repository.ClientRepository;
import com.example.store.repository.CommandeRepository;

@Service
public class ArticlesService implements ArticlesItf{
    @Autowired
    private ArticlesRepository repo;

    @Autowired
    private CommandeRepository cdeRepo;
    

    public void addArticle(Long id, String nomArticle, int qte, double prix){
            Commande commande = cdeRepo.findById(id).orElseThrow(() -> new RuntimeException("Commande non trouvée"));
            Articles article = new Articles(nomArticle, qte, prix, commande);
            repo.save(article);  
    
    }

    public List<Articles> getArticlesByCommande(Long id) {
        return repo.findByCommandeId(id);
    }

    public void deleteArticle(Long idArt) {
        repo.deleteById(idArt);
    }

}
