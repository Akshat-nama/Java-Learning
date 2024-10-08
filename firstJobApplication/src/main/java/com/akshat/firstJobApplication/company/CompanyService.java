package com.akshat.firstJobApplication.company;

import java.util.List;

public interface CompanyService {
    public List<Company> getAllCompanies();
    public void addCompany(Company company);
    public void updateCompany(Company company, Long id);
    public void deleteCompany(Long id);
    public Company getCompanyById(Long id);
}
