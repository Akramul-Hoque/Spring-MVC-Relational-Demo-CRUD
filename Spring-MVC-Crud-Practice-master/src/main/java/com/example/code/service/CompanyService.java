package com.example.code.service;

import com.example.code.model.Company;
import com.example.code.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private final CompanyRepository repository;

    public CompanyService(CompanyRepository repository) {
        this.repository = repository;
    }

    public void addCompany(Company company){
        repository.save(company);
    }
    public List<Company> getCompanies(){
        return (List<Company>) repository.findAll();
    }
    public Company getCompanyById(int id){
        return repository.findById(id).get();
    }
    public void deleteCompany(int id){
        repository.deleteById(id);
    }
    public void updateCompany(Company company){
        Company findCompany = getCompanyById(company.getId());
        if(findCompany != null){
            repository.save(company);
        }
    }
}
