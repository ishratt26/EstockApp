package com.estock.stockPrice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import com.estock.stockPrice.domain.StockPrice;
import com.estock.stockPrice.service.StockPriceService;

@RestController
@RequestMapping(path = "/api/v1.0/market/stock")
public class StockPriceController {

    @Autowired
    StockPriceService stockPriceService;

    @PostMapping("/add/{companyCode}")
    public ResponseEntity<StockPrice> addStockPrice(@RequestBody StockPrice stockPrice, @PathVariable String companyCode){
        StockPrice createdStockPrice = stockPriceService.add(stockPrice, companyCode);
        return new ResponseEntity<>(createdStockPrice, HttpStatus.CREATED);
    }

    @GetMapping("/get/{companycode}/{startdate}/{enddate}")
    public ResponseEntity<List<StockPrice>> fetchStockDetails(@PathVariable("companycode") String companyCode,
                                                              @PathVariable("startdate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                                                              @PathVariable("endate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {

        List<StockPrice> stockPriceList = stockPriceService.getStockPriceList(companyCode, startDate, endDate);
        return new ResponseEntity<>(stockPriceList, HttpStatus.OK);
    }

}
