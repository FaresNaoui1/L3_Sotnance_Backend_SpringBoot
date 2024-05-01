package com.SotnanceL3.SotnanceL3Api.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String name;
    private LocalDate birthdate;
    private int sellPhone;


    @ManyToMany(mappedBy = "persons")
    private List<Vehicule> vehicules;


    @ManyToOne
    Roll roll;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getSellPhone() {
        return sellPhone;
    }

    public void setSellPhone(int sellPhone) {
        this.sellPhone = sellPhone;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }

    public Roll getRoll() {
        return roll;
    }

    public void setRoll(Roll roll) {
        this.roll = roll;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", sellPhone=" + sellPhone +
                ", vehicules=" + vehicules +
                ", roll=" + roll +
                '}';
    }
}
