package com.example.store.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.store.model.Client;

public interface ClientRepository extends CrudRepository<Client, String> {
    Optional<Client> findByEmail(String email);
}
