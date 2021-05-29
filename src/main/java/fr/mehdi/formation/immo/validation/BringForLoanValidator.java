package fr.mehdi.formation.immo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.mehdi.formation.immo.domain.dtos.RealEstateLoanCreate;

public class BringForLoanValidator implements ConstraintValidator<BringForLoan, RealEstateLoanCreate> {

    @Override
    public boolean isValid(RealEstateLoanCreate dto, ConstraintValidatorContext context) {
	// TODO Auto-generated method stub
	if (dto == null) {
	    return false;
	}

	int amount = dto.getAmount();
	Integer bring = dto.getBring();

	if (bring == null)
	    return true;

	return (2 * bring) <= amount;
    }
}
