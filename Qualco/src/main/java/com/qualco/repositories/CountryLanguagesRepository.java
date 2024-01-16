package com.qualco.repositories;

import com.qualco.entities.CountryLanguage;
import com.qualco.entities.CountryLanguageId;
import com.qualco.entities.Languages;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryLanguagesRepository extends JpaRepository<CountryLanguage, CountryLanguageId> {

    @Query("SELECT cl.language FROM CountryLanguage cl WHERE cl.id.countryId = :countryId")
    List<Languages> findLanguagesByCountryId(@Param("countryId") Long countryId);
}
