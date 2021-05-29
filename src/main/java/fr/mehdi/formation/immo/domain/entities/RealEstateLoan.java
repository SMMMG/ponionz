package fr.mehdi.formation.immo.domain.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "real_estate_loans")
public class RealEstateLoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer amount;
    private Integer bring;
    private Integer duration;
    @Column(name = "interest_rate")
    private Float interestRate;
    @Column(name = "insurance_rate")
    private Float insuranceRate;
    @Column(name = "job_loss_insurance_flag")
    private Boolean jobLossInsuranceFlag;
    @Column(name = "job_loss_insurance_rate")
    private Float jobLossInsuranceRate;
    @CreationTimestamp
    @Column(name = "creatation_date_time")
    private LocalDateTime creatationDateTime;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

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

    public LocalDateTime getCreatationDateTime() {
	return creatationDateTime;
    }

    public void setCreatationDateTime(LocalDateTime creatationDateTime) {
	this.creatationDateTime = creatationDateTime;
    }

}
