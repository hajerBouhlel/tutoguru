package com.hajer.tutorials.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String adress;

    public void setId(Long id) { this.id = id; }

    public void setName(String name) { this.name = name; }

    public void setAdress(String adress) { this.adress = adress; }

    public Long getId() { return id; }

    public String getName() { return name; }

    public String getAdress() { return adress; }
}
