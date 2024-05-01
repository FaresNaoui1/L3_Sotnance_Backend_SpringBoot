package com.SotnanceL3.SotnanceL3Api.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Facture {

    public Facture(String facture) {
        this.facture = facture;
    }

    @Id
    @SequenceGenerator(name = "facture",sequenceName = "facture",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "facture_sequance")
private Long idFacture;
private String facture;


@OneToMany(mappedBy = "facture")
private List<Piece> piece;
public Facture(){}
public Facture(Long idFacture){this.idFacture=idFacture;}
public Facture(Long idFacture,String facture){this.idFacture=idFacture;this.facture=facture;}

public Long getIdFacture() {
    return idFacture;
}
public void setIdFacture(Long idFacture) {
    this.idFacture = idFacture;
}
public String getFacture() {
    return facture;
}
public void setFacture(String facture) {
    this.facture = facture;
}

@Override
    public String toString() {
        return "Facture [idFacture=" + idFacture + ", facture=" + facture + "]";
    }
}
