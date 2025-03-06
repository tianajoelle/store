package com.example.store.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.example.store.model.Commande;

public interface CommandeRepository extends CrudRepository<Commande, Long> {
    List<Commande> findByClientEmail(String email);
    Optional<Commande> findById(Long id);
}