package com.example.store.service;

import java.util.List;
import java.util.Optional;

import com.example.store.model.Commande;

public interface CommandeItf {
    void create(String titre, String clientEmail);
    List<Commande> getCommandesByClient(String clientEmail);
    public Optional<Commande> findByCommandeId(Long id);
}
