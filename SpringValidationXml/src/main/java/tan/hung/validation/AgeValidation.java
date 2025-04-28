package tan.hung.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import tan.hung.domain.User;

import java.time.LocalDate;
import java.time.Period;

public class AgeValidation implements ConstraintValidator<Age, User> {
    @Override
    public void initialize(Age constraintAnnotation) {

    }

    @Override
    public boolean isValid(User user, ConstraintValidatorContext constraintValidatorContext) {
        if (user.getBirthday() == null || user.getAge() == null) return false;
        Period p = Period.between(user.getBirthday(), LocalDate.now());
        return p.getYears() == user.getAge();
    }
}
