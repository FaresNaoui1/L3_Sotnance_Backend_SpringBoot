package com.SotnanceL3.SotnanceL3Api.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Onpanne {
@Override
    public String toString() {
        return "Onpanne [IdPanne=" + IdPanne + ", onpanne=" + onpanne + "]";
    }
public Onpanne(String onpanne) {
        this.onpanne = onpanne;
    }
public Onpanne() {
    }
public Onpanne(Long idPanne, String onpanne) {
        IdPanne = idPanne;
        this.onpanne = onpanne;
    }
    @Id
    @SequenceGenerator(name = "onpanne",sequenceName = "onpanne",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "onpanne_sequance")
private Long IdPanne;
private String onpanne;


@OneToMany(mappedBy = "onpanne")
private List<Vehicule> vehicules;

@OneToOne
private Piece piece;
public Long getIdPanne() {
    return IdPanne;
}
public void setIdPanne(Long idPanne) {
    IdPanne = idPanne;
}
public String getOnpanne() {
    return onpanne;
}
public void setOnpanne(String onpanne) {
    this.onpanne = onpanne;
}
}
