package com.santander.oauth2.resourcelogin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.santander.oauth2.resourcelogin.model.Company;
import com.santander.oauth2.resourcelogin.service.CompanyServiceImpl;

@RestController
@RequestMapping("/secured/company")
public class CompanyController {

    @Autowired
    private CompanyServiceImpl companyServiceImpl;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody
    List<Company> getAll() {
        return companyServiceImpl.getAll();
    }

    
}