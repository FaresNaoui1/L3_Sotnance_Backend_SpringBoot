package com.SotnanceL3.SotnanceL3Api.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Rapport {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private  String rapport;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRapport() {
        return rapport;
    }

    public void setRapport(String rapport) {
        this.rapport = rapport;
    }

    @Override
    public String toString() {
        return "Rapport [id=" + id + ", rapport=" + rapport + "]";
    }
}
