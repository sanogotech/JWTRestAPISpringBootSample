package com.formationsec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.formationsec.model.Bibliotheque;


@RepositoryRestResource
public interface BibliothequeRepository extends JpaRepository<Bibliotheque, Long>{
	
	
	Bibliotheque findByNom(String nom);

}
