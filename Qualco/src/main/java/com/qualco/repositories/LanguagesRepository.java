package com.qualco.repositories;

import com.qualco.entities.Languages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguagesRepository extends JpaRepository<Languages, Long> {
}
