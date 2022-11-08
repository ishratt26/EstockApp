package com.estock.stockPrice.repository;

import com.estock.stockPrice.domain.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice, Integer> {

    List<StockPrice> findAllByCompanyCodeAndDate(String companyCode, Date start, Date end);
}
