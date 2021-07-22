package com.formationsec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.formationsec.model.biblio.Livre;

@RepositoryRestResource
public interface LivreRepository extends JpaRepository<Livre, Long> {

}

