package com.akshat.firstJobApplication.company.impl;

import com.akshat.firstJobApplication.company.Company;
import com.akshat.firstJobApplication.company.CompanyRepository;
import com.akshat.firstJobApplication.company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceimpl implements CompanyService {

    public CompanyServiceimpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    private CompanyRepository companyRepository;

    @Override
    public List<Company> getAllCompanies() {
        return List.of();
    }

    @Override
    public void addCompany(Company company) {

    }

    @Override
    public void updateCompany(Company company, Long id) {

    }

    @Override
    public void deleteCompany(Long id) {

    }

    @Override
    public Company getCompanyById(Long id) {
        return null;
    }
}
