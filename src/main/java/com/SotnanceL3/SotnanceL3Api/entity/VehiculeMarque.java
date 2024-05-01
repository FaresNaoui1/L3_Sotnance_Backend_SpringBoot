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
public class VehiculeMarque {
    @Id
    @SequenceGenerator(name = "vehiculemarque",sequenceName = "vehiculemarque",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "vehiculemarque_sequance")
    private Long IdVM;
    private String Vehiculemarque;

    @OneToMany(mappedBy = "vehiculeMarque")
    private List<Vehicule> vehicules;


    public VehiculeMarque(String vehiculemarque) {
        Vehiculemarque = vehiculemarque;
    }
    public VehiculeMarque(Long idVM, String vehiculemarque) {
        IdVM = idVM;
        Vehiculemarque = vehiculemarque;
    }
    public VehiculeMarque() {
    }
    @Override
    public String toString() {
        return "VehiculeMarque [IdVM=" + IdVM + ", Vehiculemarque=" + Vehiculemarque + "]";
    }
 
    public Long getIdVM() {
        return IdVM;
    }
    public void setIdVM(Long idVM) {
        IdVM = idVM;
    }
    public String getVehiculemarque() {
        return Vehiculemarque;
    }
    public void setVehiculemarque(String vehiculemarque) {
        Vehiculemarque = vehiculemarque;
    }
}
