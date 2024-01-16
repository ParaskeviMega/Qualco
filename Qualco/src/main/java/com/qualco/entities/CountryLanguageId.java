package com.qualco.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CountryLanguageId implements Serializable {

    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "language_id")
    private Long languageId;

    public CountryLanguageId() {}

}
