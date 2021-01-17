package com.alexchirea.SimpleSpringBootApp.constraint;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CustomGoogleEmailValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomGoogleEmailConstraint {

    String message() default "The email must have \"@gmail.com\" extension";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
