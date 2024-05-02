package com.SotnanceL3.SotnanceL3Api.entity;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Vehicule {
    public Vehicule(Long idVehicule, String vehiculeMatriquelle) {
        this.idVehicule = idVehicule;
        VehiculeMatriquelle = vehiculeMatriquelle;
    }

    public Vehicule() {
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "idVehicule=" + idVehicule +
                ", vehiculeMatriquelle='" + VehiculeMatriquelle + '\'' +
                ", imageBlob=" + Arrays.toString(image) +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idVehicule;
    private String VehiculeMatriquelle;
    private byte[] image;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Person_Vehicule",
            joinColumns = @JoinColumn(name = "idVehicule"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private List<Person> persons;


@ManyToOne
private VehiculeMarque vehiculeMarque;

@ManyToOne
private VehiculeType vehiculeType;

@ManyToOne
private Location location;


@ManyToOne
private Onpanne onpanne;


    public Vehicule(String vehiculeMatriquelle) {
        VehiculeMatriquelle = vehiculeMatriquelle;
    }

    public Long getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(Long idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getVehiculeMatriquelle() {
        return VehiculeMatriquelle;
    }

    public void setVehiculeMatriquelle(String vehiculeMatriquelle) {
        VehiculeMatriquelle = vehiculeMatriquelle;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
