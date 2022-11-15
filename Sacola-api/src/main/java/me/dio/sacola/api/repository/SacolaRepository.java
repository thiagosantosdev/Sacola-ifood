package me.dio.sacola.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.sacola.api.model.Sacola;

@Repository
public interface SacolaRepository extends JpaRepository<Sacola, Long> {

}
