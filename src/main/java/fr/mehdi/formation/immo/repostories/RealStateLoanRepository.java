package fr.mehdi.formation.immo.repostories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.mehdi.formation.immo.domain.dtos.RealEstaeLoanView;
import fr.mehdi.formation.immo.domain.entities.RealEstateLoan;

public interface RealStateLoanRepository extends JpaRepository<RealEstateLoan, Long> {
    // Optional<RealEstateLoanCreate> getById(Long id);

    Optional<RealEstaeLoanView> getById(Long id);

}
