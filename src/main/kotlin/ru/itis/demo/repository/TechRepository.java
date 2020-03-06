package ru.itis.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.itis.demo.models.Tech;

public interface TechRepository extends CrudRepository<Tech, Long> {
}