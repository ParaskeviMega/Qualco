package com.qualco.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "country_languages")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    @ManyToOne
    @JoinColumn(name = "country_id", insertable = false, updatable = false)
    private Countries country;

    @ManyToOne
    @JoinColumn(name = "language_id", insertable = false, updatable = false)
    private Languages language;

}
