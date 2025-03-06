package com.example.store.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.store.model.Articles;

public interface ArticlesRepository extends CrudRepository<Articles, Long>{
    List<Articles> findByCommandeId(Long id);
    void deleteById(Long idArt);
}
