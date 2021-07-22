package com.formationsec.model.biblio;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nom;
    

    @ManyToMany(cascade = CascadeType.ALL)
    //@JoinTable(name = "livre_auteur", joinColumns = @JoinColumn(name = "livre_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "auteur_id", referencedColumnName = "id"))
    private List<Livre> livres;

    public Auteur() {
    }

    public Auteur(String nom) {
        super();
        this.nom = nom;
    }

    
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    
}