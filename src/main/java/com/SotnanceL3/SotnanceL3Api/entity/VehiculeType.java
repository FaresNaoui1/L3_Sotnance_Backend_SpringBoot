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
public class VehiculeType {
    @Id
    @SequenceGenerator(name = "vehiculetype",sequenceName = "vehiculetype",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "vehiculetype_sequance")    
  
    private Long IdVType;
    private String Vehiculetype;


    @OneToMany(mappedBy = "vehiculeType")
    private List<Vehicule> vehicules;

public List<Vehicule> getVehicules() {
        return vehicules;
    }
    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }
public VehiculeType(String vehiculetype) {
        Vehiculetype = vehiculetype;
    }
public VehiculeType(Long idVType, String vehiculetype) {
        IdVType = idVType;
        Vehiculetype = vehiculetype;
    }
public VehiculeType() {
    }

    @Override
    public String toString() {
        return "VehiculeType{" +
                "IdVType=" + IdVType +
                ", Vehiculetype='" + Vehiculetype + '\'' +
                ", vehicules=" + vehicules +
                '}';
    }

    public Long getIdVType() {
    return IdVType;
}
public void setIdVType(Long idVType) {
    IdVType = idVType;
}
public String getVehiculetype() {
    return Vehiculetype;
}
public void setVehiculetype(String vehiculetype) {
    Vehiculetype = vehiculetype;
}
}
