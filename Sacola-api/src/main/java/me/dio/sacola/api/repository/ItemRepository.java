package me.dio.sacola.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.sacola.api.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
