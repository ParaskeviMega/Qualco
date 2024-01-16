package com.qualco.repositories;

import com.qualco.entities.Guests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guests, Integer> {
}
