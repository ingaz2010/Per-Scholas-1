package com.israr_zaslavskaya.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
        @NamedQuery(name = "displayAllHospitals", query = "select h from Hospital h"),
        @NamedQuery(name = "findHospitalById", query = "select h from Hospital h where hospitalId = :id"),
        @NamedQuery(name = "findHospitalByName", query = "select h from Hospital h where hospitalName = :name")
})
public class Hospital implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hospitalId;
    private String hospitalName;
    private String hospitalAddress;

    @OneToMany(targetEntity = Doctor.class, cascade = CascadeType.ALL)
    private Set<Doctor> doctorlist = new HashSet<Doctor>();

    public Hospital(String Name){
        this.hospitalName = Name;
    }
}
