package com.example.store.service;

import java.util.List;

import com.example.store.model.Articles;

public interface ArticlesItf {
    void addArticle(Long id, String nomArticle, int qte, double prix);

    List<Articles> getArticlesByCommande(Long id);
    
    void deleteArticle(Long idArt);

}
