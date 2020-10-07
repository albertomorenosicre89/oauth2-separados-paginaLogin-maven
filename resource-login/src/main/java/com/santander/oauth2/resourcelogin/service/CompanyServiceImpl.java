package com.santander.oauth2.resourcelogin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.oauth2.resourcelogin.model.Company;
import com.santander.oauth2.resourcelogin.repository.CompanyRepositoryImpl;

@Service
public class CompanyServiceImpl {

    @Autowired
    private CompanyRepositoryImpl companyRepositoryImpl;


    public List<Company> getAll() {
        return companyRepositoryImpl.findAll();
    }

    
}
