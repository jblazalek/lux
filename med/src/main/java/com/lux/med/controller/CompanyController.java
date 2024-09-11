package com.lux.med.controller;

import com.lux.med.model.Company;
import com.lux.med.repository.CompanyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {
    private final CompanyRepository repository;
    CompanyController(CompanyRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    List<Company> getAll() {
        return repository.findAll();
    }

    @GetMapping("/employees/{id}")
    Optional<Company> getCompany(@PathVariable Long id) {
        return repository.findById(id);
    }
    @DeleteMapping("/{id}")
    void deleteCompany(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
