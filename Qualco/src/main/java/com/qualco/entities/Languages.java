package com.qualco.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "languages")
public class Languages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer language_id;

    @Column(name = "language")
    private String language;
}
