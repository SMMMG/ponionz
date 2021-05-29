package fr.mehdi.formation.immo.domain.dtos;

import java.time.LocalDateTime;

public interface RealEstaeLoanView {
    public Long getId();

    public Integer getAmount();

    public Integer getBring();

    public Integer getDuration();

    public Float getInterestRate();

    public Boolean getJobLossInsuranceFlag();

    public Float getJobLossInsuranceRate();

    public LocalDateTime getCreatationDateTime();
}
