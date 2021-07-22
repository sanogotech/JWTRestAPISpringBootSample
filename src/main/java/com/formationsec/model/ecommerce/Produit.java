package com.formationsec.model.ecommerce;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Produit {
	
	
	    @Id
	    private long refProduit;
	    private  String nom;
	    private  int  quantiteStock;
	    private String description;
	    private  Category category;
	    
	    
	    @OneToOne(mappedBy = "produit")
	    private LigneCommande ligneCommande;


		public long getRefProduit() {
			return refProduit;
		}


		public void setRefProduit(long refProduit) {
			this.refProduit = refProduit;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public int getQuantiteStock() {
			return quantiteStock;
		}


		public void setQuantiteStock(int quantiteStock) {
			this.quantiteStock = quantiteStock;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public Category getCategory() {
			return category;
		}


		public void setCategory(Category category) {
			this.category = category;
		}


		public LigneCommande getLigneCommande() {
			return ligneCommande;
		}


		public void setLigneCommande(LigneCommande ligneCommande) {
			this.ligneCommande = ligneCommande;
		}
	    
	    

}
