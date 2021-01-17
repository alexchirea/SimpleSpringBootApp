package com.alexchirea.SimpleSpringBootApp.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomGoogleEmailValidator
        implements ConstraintValidator<CustomGoogleEmailConstraint, String> {

    @Override
    public void initialize(CustomGoogleEmailConstraint email) {
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return email != null && email.matches("^[a-zA-Z0-9.]+@gmail.com");
    }

}
