package com.example.laborat.repository;

import com.example.laborat.Entite.Laboratoire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratoireRepository extends JpaRepository <Laboratoire, Long> {
}
