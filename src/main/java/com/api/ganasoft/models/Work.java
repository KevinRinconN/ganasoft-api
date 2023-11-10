package com.api.ganasoft.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Work")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Work implements Serializable{
    
    @Id
    private Long id;
    private Date date;
    private String observations;

    @ManyToOne
    @JoinColumn(name = "idTreatment")
    private Treatment treatment;

    @ManyToMany(mappedBy = "work")
    private List<Cattle> cattle;

}
