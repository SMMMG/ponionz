package fr.mehdi.formation.immo.validation;

import java.util.HashSet;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.mehdi.formation.immo.domain.dtos.RealEstateLoanCreate;

public class JobLossInsuranceValidator implements ConstraintValidator<JobLossInsurance, RealEstateLoanCreate> {
    private HashSet<Float> acceptedRates;

    JobLossInsuranceValidator() {
	acceptedRates = new HashSet<Float>();
	acceptedRates.add(0.3f);
	acceptedRates.add(0.4f);
	acceptedRates.add(0.5f);
	acceptedRates.add(0.6f);
	acceptedRates.add(0.7f);
    }

    @Override
    public boolean isValid(RealEstateLoanCreate dto, ConstraintValidatorContext context) {
	// TODO Auto-generated method stub
	if (dto == null) {
	    return false;
	}

	Boolean flag = dto.getJobLossInsuranceFlag();
	//
	if (!flag) {
	    return true;
	}

	Float rate = dto.getJobLossInsuranceRate();
	if (rate == null)
	    return false;

	return this.acceptedRates.contains(dto.getJobLossInsuranceRate());
    }
}
