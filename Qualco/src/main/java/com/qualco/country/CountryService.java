package com.qualco.country;

import com.qualco.entities.Countries;
import com.qualco.entities.Languages;
import com.qualco.repositories.CountriesRepository;
import com.qualco.repositories.CountryLanguagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final CountriesRepository countriesRepository;

    private CountryLanguagesRepository countryLanguagesRepository;

    @Autowired
    public CountryService(CountriesRepository countriesRepository,
    CountryLanguagesRepository countryLanguagesRepository) {
        this.countriesRepository = countriesRepository;
        this.countryLanguagesRepository = countryLanguagesRepository;
    }

    public List<Countries> getCountries() {
        return countriesRepository.findAll();
    }

    public List<Languages> getCountryLanguage() {
        return countryLanguagesRepository.findLanguagesByCountryId(1L);
    }
}
