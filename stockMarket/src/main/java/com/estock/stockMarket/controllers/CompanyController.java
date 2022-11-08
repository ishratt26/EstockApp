package com.estock.stockMarket.controllers;

import com.estock.stockMarket.domain.Company;
import com.estock.stockMarket.service.CompanyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1.0/market/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @ApiOperation(value = "This api allows the creation of a company")
    @PostMapping("/register")
    public ResponseEntity<Company> registerCompany(@Valid @RequestBody Company company) {
        System.out.println(company);
        Company createdCompany = companyService.createCompany(company);
        return new ResponseEntity<>(createdCompany, HttpStatus.CREATED);
    }

    @ApiOperation(value = "This api allows the retrieval of a company by its company code")
    @GetMapping("/info/{companycode}")
    public ResponseEntity<Company> getCompanyInfo(@PathVariable int companyCode){
        Company companyInfo = companyService.getCompanyInfo(companyCode);
        return new ResponseEntity<>(companyInfo, HttpStatus.OK);
    }

    @ApiOperation(value = "This api allows the retrieval of all the companies")
    @GetMapping("/getAll")
    public ResponseEntity<List<Company>> getAllCompanies(){
        List<Company> allCompanies = companyService.getAllCompanies();
        return new ResponseEntity<>(allCompanies,HttpStatus.OK);
    }

    @ApiOperation(value = "This api allows the deletion of a company by its company code")
    @DeleteMapping("/delete/{companycode}")
    public ResponseEntity<Object> deleteCompany(@PathVariable int companyCode){
        companyService.deleteCompany(companyCode);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
