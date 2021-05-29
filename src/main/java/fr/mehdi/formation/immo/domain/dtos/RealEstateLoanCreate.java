package fr.mehdi.formation.immo.domain.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import fr.mehdi.formation.immo.validation.BringForLoan;
import fr.mehdi.formation.immo.validation.JobLossInsurance;

@BringForLoan
@JobLossInsurance

public class RealEstateLoanCreate {
    @Min(value = 100000, message = "Min value for amount is 100 000")
    @Max(value = 600000, message = "Max value for amount is 600 000")
    private Integer amount;
    private Integer bring;
    @Min(value = 2, message = "Min value for duration is 2")
    @Max(value = 30, message = "Max value for duration is 30")
    private Integer duration;

    private Float interestRate;
    private Float insuranceRate;
    private Boolean jobLossInsuranceFlag;
    private Float jobLossInsuranceRate;

    public Integer getAmount() {
	return amount;
    }

    public void setAmount(Integer amount) {
	this.amount = amount;
    }

    public Integer getBring() {
	return bring;
    }

    public void setBring(Integer bring) {
	this.bring = bring;
    }

    public Integer getDuration() {
	return duration;
    }

    public void setDuration(Integer duration) {
	this.duration = duration;
    }

    public Float getInterestRate() {
	return interestRate;
    }

    public void setInterestRate(Float interestRate) {
	this.interestRate = interestRate;
    }

    public Float getInsuranceRate() {
	return insuranceRate;
    }

    public void setInsuranceRate(Float insuranceRate) {
	this.insuranceRate = insuranceRate;
    }

    public Boolean getJobLossInsuranceFlag() {
	return jobLossInsuranceFlag;
    }

    public void setJobLossInsuranceFlag(Boolean jobLossInsuranceFlag) {
	this.jobLossInsuranceFlag = jobLossInsuranceFlag;
    }

    public Float getJobLossInsuranceRate() {
	return jobLossInsuranceRate;
    }

    public void setJobLossInsuranceRate(Float jobLossInsuranceRate) {
	this.jobLossInsuranceRate = jobLossInsuranceRate;
    }

}
