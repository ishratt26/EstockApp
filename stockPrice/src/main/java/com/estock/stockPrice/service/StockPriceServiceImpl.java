package com.estock.stockPrice.service;

import com.estock.stockPrice.domain.StockPrice;
import com.estock.stockPrice.repository.StockPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StockPriceServiceImpl implements StockPriceService {

    @Autowired
    StockPriceRepository stockPriceRepository;

    @Override
    public StockPrice add(StockPrice stockPrice, String companyCode) {
        return stockPriceRepository.save(stockPrice);
    }

    @Override
    public List<StockPrice> getStockPriceList(String companyCode, Date start, Date end) {
        return stockPriceRepository.findAllByCompanyCodeAndDate(companyCode, start, end);
    }
}
