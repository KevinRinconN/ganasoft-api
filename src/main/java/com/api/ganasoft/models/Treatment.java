package com.api.ganasoft.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Treatment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Treatment implements Serializable{
    
    @Id
    private Long id;
    private Integer month;
    private String treatmentType;
    private String description;
    private Boolean gender;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="treatment")
    private List<Work> work;
}
