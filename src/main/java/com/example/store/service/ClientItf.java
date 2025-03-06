package com.example.store.service;

import java.util.Optional;

import com.example.store.model.Client;

public interface ClientItf {

	void registration(String email, String password, String name, String firstName);

	Optional<Client> findById(String email);

	boolean existById(String email);

	Optional<Client> findByEmail(String email);

}