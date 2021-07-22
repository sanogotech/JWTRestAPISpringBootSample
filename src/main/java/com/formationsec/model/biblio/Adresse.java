package com.formationsec.model.biblio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idadr;
    
    @Column(nullable = false)
    private String rue;
    
    @Column(nullable = false)
    private String ville;
    
    public Adresse() {
    }

    public Adresse(String rue, String ville) {
        this.rue = rue;
        this.ville = ville;
    }

    @OneToOne(mappedBy = "adresse")
    private Bibliotheque bibliotheque;

	public long getIdadr() {
		return idadr;
	}

	public void setIdadr(long idadr) {
		this.idadr = idadr;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Bibliotheque getBibliotheque() {
		return bibliotheque;
	}

	public void setBibliotheque(Bibliotheque bibliotheque) {
		this.bibliotheque = bibliotheque;
	}

    
    
    


}
