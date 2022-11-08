package com.estock.stockPrice.service;

import java.util.Date;
import java.util.List;

import com.estock.stockPrice.domain.StockPrice;


public interface StockPriceService {

    StockPrice add(StockPrice stockPrice, String companyCode);

    List<StockPrice> getStockPriceList(String companyCode, Date start, Date end);
}
