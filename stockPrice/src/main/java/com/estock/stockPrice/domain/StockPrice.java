package com.estock.stockPrice.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "stockprice")
public class StockPrice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stockPriceId;

    private String companyCode;

    private double stockPrice;

    private Date date;

    private Date time;

}
