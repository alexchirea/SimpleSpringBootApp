package com.alexchirea.SimpleSpringBootApp.model;

import com.alexchirea.SimpleSpringBootApp.constraint.CustomGoogleEmailConstraint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "The Full Name can't be null")
    @Size(min = 5, message = "{Size.Person.FullName}")
    private String fullName;

    @NotEmpty
    @CustomGoogleEmailConstraint
    private String email;

    @NotNull
    @Min(value = 18)
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
