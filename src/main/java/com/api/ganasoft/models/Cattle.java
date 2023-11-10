package com.api.ganasoft.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "Cattle")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cattle implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateOfBirth;
    private String distinctiveTrait;
    private String gender;
    private String breed;
    private String brand;

    public Cattle (Date dateOfBirth,String distinctiveTrait, String gender, String breed,String brand, Cattle father, Cattle mother){
        this.dateOfBirth = dateOfBirth;
        this.distinctiveTrait = distinctiveTrait;
        this.gender = gender;
        this.breed = breed;
        this.brand = brand;
        this.father = father;
        this.mother = mother;
    }

    @ManyToOne
    @JoinColumn(name = "idFather")
    private Cattle father;

    @ManyToOne
    @JoinColumn(name = "idMother")
    private Cattle mother;


    @ManyToOne
    @JoinColumn(name = "idSele")
    private Sele sele;


    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="father")
    private List<Cattle> offspringFather;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="mother")
    private List<Cattle> offspringMother;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "cattle")
    private List<Gestation> gestations;


    @ManyToMany
    @JoinTable(name = "Event",joinColumns = @JoinColumn(name = "idCattle"), inverseJoinColumns = @JoinColumn(name = "idWork"))
    private List<Work> work;
}
