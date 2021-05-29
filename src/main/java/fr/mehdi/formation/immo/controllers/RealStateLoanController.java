package fr.mehdi.formation.immo.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mehdi.formation.immo.domain.dtos.RealEstateLoanCreate;
import fr.mehdi.formation.immo.services.RealStateLoanService;

@RestController
@RequestMapping("/ponionz")
public class RealStateLoanController {
    private RealStateLoanService service;

    RealStateLoanController(RealStateLoanService service) {
	this.service = service;
    }

    @PostMapping
    void create(@Valid @RequestBody RealEstateLoanCreate dto) {
	service.Create(dto);
    }

    @GetMapping("/{id}")
    void getById(@PathVariable("id") Long id) {
	service.getById(id);
    }

}
