package com.qualco.country;

import com.qualco.entities.Countries;
import com.qualco.entities.Languages;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountriesController {

    private final CountryService countryService;

    public CountriesController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public List<Countries> getCountries() {
        return countryService.getCountries();
    }

    @GetMapping("/languages")
    public List<Languages> getLanguages() {
        return countryService.getCountryLanguage();
    }
}
