package com.lux.med.controller;

import com.lux.med.exceptions.CompanyNotFoundException;
import com.lux.med.model.Company;
import com.lux.med.repository.CompanyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    private final CompanyRepository repository;

    CompanyController(CompanyRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    List<Company> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    Company getCompany(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new CompanyNotFoundException(id));
    }

    @PostMapping
    public Company createCompany(@RequestBody Company company) {
        return repository.save(company);
    }

    @PutMapping("/{id}")
    public Company updateCompany(@PathVariable Long id, @RequestBody Company updCompany) {
            return repository.findById(id).map(company -> {
                        company.setName(updCompany.getName());
                        company.setDepartments(updCompany.getDepartments());
                return repository.save(company);
            }).orElseThrow(() -> new CompanyNotFoundException(id));
    }

    @DeleteMapping("/{id}")
    void deleteCompany(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @DeleteMapping("/all")
    void deletAll() {
        repository.deleteAll();
    }
}
