package fr.mehdi.formation.immo.services;

import org.springframework.stereotype.Service;

import fr.mehdi.formation.immo.domain.dtos.RealEstaeLoanView;
import fr.mehdi.formation.immo.domain.dtos.RealEstateLoanCreate;
import fr.mehdi.formation.immo.domain.entities.RealEstateLoan;
import fr.mehdi.formation.immo.repostories.RealStateLoanRepository;

@Service
public class RealStateLoanServiceImpl implements RealStateLoanService {
    private RealStateLoanRepository repository;

    RealStateLoanServiceImpl(RealStateLoanRepository repository) {
	this.repository = repository;
    }

    @Override
    public void Create(RealEstateLoanCreate dto) {
	// TODO Auto-generated method stub
	RealEstateLoan entity = new RealEstateLoan();

	entity.setAmount(dto.getAmount());
	entity.setBring(dto.getBring());
	entity.setDuration(dto.getDuration());
	entity.setInsuranceRate(dto.getInsuranceRate());
	entity.setJobLossInsuranceRate(dto.getJobLossInsuranceRate());
	entity.setJobLossInsuranceFlag(dto.getJobLossInsuranceFlag());
	repository.save(entity);
    }

    @Override
    public RealEstaeLoanView getById(Long id) {
	// TODO Auto-generated method stub
	return repository.getById(id).get();
    }

}
