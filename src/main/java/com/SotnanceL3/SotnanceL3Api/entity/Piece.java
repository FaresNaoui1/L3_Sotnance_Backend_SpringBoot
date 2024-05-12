package com.SotnanceL3.SotnanceL3Api.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Piece {
    public Piece(String pieceName) {
        PieceName = pieceName;
    }
    public Piece() {
    }
    public Piece(Long idPiece, String pieceName) {
        this.idPiece = idPiece;
        PieceName = pieceName;
    }
    @Id
    @SequenceGenerator(name = "piece",sequenceName = "piece",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "piece_sequance")
private Long idPiece;
private String PieceName;

@OneToMany(mappedBy = "piece")
private List<Onpanne> onpanne;

public List<Onpanne> getOnpanne() {
    return onpanne;
}
public void setOnpanne(List<Onpanne> onpanne) {
    this.onpanne = onpanne;
}
@ManyToOne
private Facture facture;

public Facture getFacture() {
    return facture;
}
public void setFacture(Facture facture) {
    this.facture = facture;
}
public Long getIdPiece() {
    return idPiece;
}
public void setIdPiece(Long idPiece) {
    this.idPiece = idPiece;
}
public String getPieceName() {
    return PieceName;
}
public void setPieceName(String pieceName) {
    PieceName = pieceName;
}

    @Override
    public String toString() {
        return "Piece{" +
                "idPiece=" + idPiece +
                ", PieceName='" + PieceName + '\'' +
                ", onpanne=" + onpanne +
                ", facture=" + facture +
                '}';
    }
}
