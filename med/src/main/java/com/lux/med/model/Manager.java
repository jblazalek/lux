package com.lux.med.model;

import jakarta.persistence.*;

@Entity
public class Manager {
    @Id
    @GeneratedValue
    private Long id;
    private String contactInfo;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
