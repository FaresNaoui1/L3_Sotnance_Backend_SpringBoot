package com.SotnanceL3.SotnanceL3Api.entity;




import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Roll {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)


    private Long id;
    private String type;


    @JsonManagedReference
    @JsonIgnore
    @OneToMany(mappedBy = "roll")
    private List<Person> persons;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Person> getPersons() {
        return this.persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Roll{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", persons=" + persons +
                '}';
    }
}
