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
        vehiculeMatriquelle = vehiculeMatriquelle;
    }

    public Vehicule() {
    }

    public String getVehiculemarque() {
        return vehiculemarque;
    }

    public void setVehiculemarque(String vehiculemarque) {
        this.vehiculemarque = vehiculemarque;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idVehicule;
    private String vehiculeMatriquelle;
    private byte[] image;
    private String vehiculemarque;

    @Override
    public String toString() {
        return "Vehicule{" +
                "idVehicule=" + idVehicule +
                ", vehiculeMatriquelle='" + vehiculeMatriquelle + '\'' +
                ", image=" + Arrays.toString(image) +
                ", vehiculemarque='" + vehiculemarque + '\'' +
                ", Matricule='" + Matricule + '\'' +
                ", persons=" + persons +
                ", vehiculeType=" + vehiculeType +
                ", location=" + location +
                ", onpanne=" + onpanne +
                '}';
    }

    public String getMatricule() {
        return Matricule;
    }

    public void setMatricule(String matricule) {
        Matricule = matricule;
    }

    public String Matricule;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Person_Vehicule",
            joinColumns = @JoinColumn(name = "idVehicule"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private List<Person> persons;


@ManyToOne
private VehiculeType vehiculeType;

public VehiculeType getVehiculeType() {
    return vehiculeType;
}

public void setVehiculeType(VehiculeType vehiculeType) {
    this.vehiculeType = vehiculeType;
}

@ManyToOne
private Location location;


public Location getLocation() {
    return location;
}

public void setLocation(Location location) {
    this.location = location;
}

@ManyToOne
private Onpanne onpanne;


    public Onpanne getOnpanne() {
    return onpanne;
}

public void setOnpanne(Onpanne onpanne) {
    this.onpanne = onpanne;
}

    public Vehicule(String vehiculeMatriquelle) {
        vehiculeMatriquelle = vehiculeMatriquelle;
    }

    public Long getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(Long idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getVehiculeMatriquelle() {
        return vehiculeMatriquelle;
    }

    public void setVehiculeMatriquelle(String vehiculeMatriquelle) {
        vehiculeMatriquelle = vehiculeMatriquelle;
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
