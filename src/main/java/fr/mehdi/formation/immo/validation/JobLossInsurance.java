package fr.mehdi.formation.immo.validation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target({ TYPE })
@Constraint(validatedBy = { JobLossInsuranceValidator.class })
public @interface JobLossInsurance {
    String message() default "Job Loss Insurance Rate must bi one in set{0.30, 0.40, 0.50, 0.60, 0.70}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
