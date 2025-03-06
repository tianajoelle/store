package com.example.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.store.model.Commande;
import com.example.store.repository.ClientRepository;
import com.example.store.repository.CommandeRepository;

@Service
public class CommandeService implements CommandeItf{
	
	@Autowired
    private CommandeRepository repo;

    @Autowired
    private ClientRepository clientRepo;

	@Override
	public void create(String titre, String clientEmail) {
        clientRepo.findById(clientEmail).ifPresent(client -> {
            Commande commande = new Commande(titre, client);
            repo.save(commande);
        });
	}

	@Override
	public List<Commande> getCommandesByClient(String clientEmail) {
		return repo.findByClientEmail(clientEmail);
	}

    @Override
	public Optional<Commande> findByCommandeId(Long id) {
    	return repo.findById(id); 
	}

}
