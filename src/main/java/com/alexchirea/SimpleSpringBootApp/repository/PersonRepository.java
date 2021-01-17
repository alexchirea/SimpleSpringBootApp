package com.alexchirea.SimpleSpringBootApp.repository;

import com.alexchirea.SimpleSpringBootApp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
