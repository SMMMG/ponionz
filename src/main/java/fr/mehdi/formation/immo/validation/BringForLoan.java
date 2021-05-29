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
@Constraint(validatedBy = { BringForLoanValidator.class })
public @interface BringForLoan {
    String message() default "Bring must be less then 50% of amount of loan";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
