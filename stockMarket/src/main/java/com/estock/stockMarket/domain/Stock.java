package com.estock.stockMarket.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "stock")
public class Stock {

    @Id
    private String stockId;

    private String stockName;
    private String companyCode;
    private double stockPrice;
    private Date stockDate;
    private String stockTime;

}
