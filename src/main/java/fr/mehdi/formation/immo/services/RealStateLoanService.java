package fr.mehdi.formation.immo.services;

import fr.mehdi.formation.immo.domain.dtos.RealEstaeLoanView;
import fr.mehdi.formation.immo.domain.dtos.RealEstateLoanCreate;

public interface RealStateLoanService {
    void Create(RealEstateLoanCreate dto);

    RealEstaeLoanView getById(Long id);
}
