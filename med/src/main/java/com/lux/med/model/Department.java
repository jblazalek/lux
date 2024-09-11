package com.lux.med.model;

import jakarta.persistence.*;

@Entity
public class Department {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
