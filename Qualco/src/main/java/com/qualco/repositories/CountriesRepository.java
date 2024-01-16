package com.qualco.repositories;

import com.qualco.entities.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Countries, Integer> {
}
