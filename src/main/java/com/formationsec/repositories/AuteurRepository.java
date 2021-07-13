package com.formationsec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.formationsec.model.Auteur;

@RepositoryRestResource
public interface AuteurRepository  extends JpaRepository<Auteur, Long> {

}
