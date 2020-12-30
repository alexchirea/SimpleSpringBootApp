package com.alexchirea.SimpleSpringBootApp.repository;

import com.alexchirea.SimpleSpringBootApp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
