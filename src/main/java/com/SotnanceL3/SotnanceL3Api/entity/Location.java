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
public class Location {
@Override
    public String toString() {
        return "Location [idLocation=" + idLocation + ", location=" + location + "]";
    }
public Location(String location) {
        this.location = location;
    }
public Location(Long idLocation, String location) {
        this.idLocation = idLocation;
        this.location = location;
    }
@Id
    @SequenceGenerator(name = "location",sequenceName = "location",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "location_sequance")

private Long idLocation;
private String location;


    
@OneToMany(mappedBy = "location")
private List<Vehicule> vehicules;
 
public Long getIdLocation() {
    return idLocation;
}
public void setIdLocation(Long idLocation) {
    this.idLocation = idLocation;
}
public String getLocation() {
    return location;
}
public void setLocation(String location) {
    this.location = location;
}
}
