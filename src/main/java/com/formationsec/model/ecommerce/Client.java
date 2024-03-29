package com.formationsec.model.ecommerce;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Client {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    
	    private  String nom;
	    private  String prenom;
	    private  String email;
	    
	    @OneToMany(mappedBy = "client",fetch= FetchType.EAGER)
	    private List<Commande> listCommandes;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public List<Commande> getListCommandes() {
			return listCommandes;
		}

		public void setListCommandes(List<Commande> listCommandes) {
			this.listCommandes = listCommandes;
		}
	    
	    

}
