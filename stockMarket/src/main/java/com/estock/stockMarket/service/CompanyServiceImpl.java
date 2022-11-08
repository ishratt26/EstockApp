package com.estock.stockMarket.service;

import com.estock.stockMarket.domain.Company;
import com.estock.stockMarket.exceptions.CompanyNotFoundException;
import com.estock.stockMarket.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public Company createCompany(Company company) {

        return companyRepository.save(company);
    }

    @Override
    public Company getCompanyInfo(int companyCode) {

        return companyRepository.findByCompanyCode(companyCode)
                .orElseThrow(() -> new CompanyNotFoundException((String.format("Company with code: %s not found", companyCode))));
    }

    @Override
    public List<Company> getAllCompanies() {

        return companyRepository.findAll();
    }

    @Override
    public void deleteCompany(int companyCode) {
        companyRepository.deleteByCompanyCode(companyCode);
    }
}
