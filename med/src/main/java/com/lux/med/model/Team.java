package com.lux.med.model;

import jakarta.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne
    private Project project;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
