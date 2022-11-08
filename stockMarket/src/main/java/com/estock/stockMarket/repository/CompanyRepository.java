package com.estock.stockMarket.repository;

import com.estock.stockMarket.domain.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends MongoRepository<Company, Integer> {

    Optional<Company> findByCompanyCode(int companyCode);

    void deleteByCompanyCode(int companyCode);
}
