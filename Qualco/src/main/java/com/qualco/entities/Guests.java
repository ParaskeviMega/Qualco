package com.qualco.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "guests")
public class Guests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guest_id;

    @Column(name = "name")
    private String name;

    public Guests() {}

    public Integer getGuest_id() {
        return guest_id;
    }

    public String getName() {
        return name;
    }

    public void setGuest_id(Integer id) {
        this.guest_id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
