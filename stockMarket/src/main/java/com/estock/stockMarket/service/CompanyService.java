package com.estock.stockMarket.service;

import com.estock.stockMarket.domain.Company;

import java.util.List;

public interface CompanyService {

    Company createCompany(Company company);

    Company getCompanyInfo(int companyCode);

    List<Company> getAllCompanies();

    void deleteCompany(int companyCode);
}
