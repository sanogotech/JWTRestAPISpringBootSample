package com.formationsec.model.ecommerce;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    
	    /**
	     * Before Java 8 and JPA 2.2, developers usually had to convert date/time types to UTC before persisting them. 
	     * JPA 2.2 now supports this feature out of the box by supporting the offset to UTC and by leveraging JDBC 4.2 support for the timezone.
	     * https://www.baeldung.com/jpa-java-time
	     */
	    @Column(name = "date_heure_commande", columnDefinition = "TIMESTAMP")
	    private LocalDateTime dateHeureCommande;
	    
	    @ManyToOne(cascade = CascadeType.ALL)
	    private  Client client;
	    
	    @OneToMany(mappedBy = "commande")
	    private  List<LigneCommande> listLigneCommande;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public LocalDateTime getDateHeureCommande() {
			return dateHeureCommande;
		}

		public void setDateHeureCommande(LocalDateTime dateHeureCommande) {
			this.dateHeureCommande = dateHeureCommande;
		}

		public Client getClient() {
			return client;
		}

		public void setClient(Client client) {
			this.client = client;
		}

		public List<LigneCommande> getListLigneCommande() {
			return listLigneCommande;
		}

		public void setListLigneCommande(List<LigneCommande> listLigneCommande) {
			this.listLigneCommande = listLigneCommande;
		}
	    
	    

}
