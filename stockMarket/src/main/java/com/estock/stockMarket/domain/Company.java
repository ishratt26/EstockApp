package com.estock.stockMarket.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@Document(collection = "companies")
@AllArgsConstructor
@NoArgsConstructor
public class Company implements Serializable {

    @Id
    private int companyId;

    @NotNull(message = "comapanyCode cannot be null")
    @NotEmpty(message = "comapanyCode cannot be empty")
    private String companyCode;

    @NotNull(message = "companyName cannot be null")
    @NotEmpty(message = "companyName cannot be empty")
    private String companyName;

    @NotNull(message = "companyCEO cannot be null")
    @NotEmpty(message = "companyCEO cannot be empty")
    private String companyCEO;

    @Min(value = 100000000, message = "companyTurnover must be greater than 10Cr")
    @NotNull(message = "companyTurnover cannot be null")
    private int companyTurnover;

    @NotNull(message = "companyWebsite cannot be null")
    @NotEmpty(message = "companyWebsite cannot be empty")
    private String companyWebsite;

    @NotNull(message = "stockExchange cannot be null")
    @NotEmpty(message = "stockExchange cannot be empty")
    private String stockExchange;

    private Set<Stock> stockPrice;


}
