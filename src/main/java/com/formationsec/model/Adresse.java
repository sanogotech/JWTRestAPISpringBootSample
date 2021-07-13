package com.formationsec.model;

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
    private long id;
    
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

    

    


}
