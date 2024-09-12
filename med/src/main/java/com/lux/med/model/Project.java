package com.lux.med.model;

import jakarta.persistence.*;

@Entity
public class Project {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne
    private Manager manager;

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

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
