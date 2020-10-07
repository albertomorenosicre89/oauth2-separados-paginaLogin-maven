package com.santander.oauth2.resourcelogin.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.santander.oauth2.resourcelogin.model.Car;
import com.santander.oauth2.resourcelogin.model.Company;
import com.santander.oauth2.resourcelogin.model.Department;

@Repository
public class CompanyRepositoryImpl  {

    public List<Company> findAll() {
    	List<Company> companys = new ArrayList<Company>();
    	
    	
    	
    	
    	
    	List<Car> cars1 = new ArrayList<Car>();
    	Car car1 = new Car();
    	car1.setId(1L);
    	car1.setRegistrationNumber("asdqwe123");
    	
    	Car car2 = new Car();
    	car2.setId(2L);
    	car2.setRegistrationNumber("123 vdfg");
    	
    	cars1.add(car1);
    	cars1.add(car2);
    	
    	List<Department> departments1 = new ArrayList<Department>();
    	Department dep1 = new Department();
    	dep1.setId(1L);
    	dep1.setName("SALES");
    	
    	Department dep2 = new Department();
    	dep2.setId(2L);
    	dep2.setName("MARKETING");
    	
    	departments1.add(dep1);
    	departments1.add(dep2);
    	
    	Company comp1 = new Company();
    	comp1.setCars(cars1);
    	comp1.setId(1L);
    	comp1.setName("COCACOLA");
    	comp1.setDepartments(departments1);
    	
    	
    	
    	
    	
    	
    	
    	
    	List<Car> cars2 = new ArrayList<Car>();
    	Car car3 = new Car();
    	car3.setId(3L);
    	car3.setRegistrationNumber("qweqweqwe");
    	
    	Car car4 = new Car();
    	car4.setId(4L);
    	car4.setRegistrationNumber("111111111");
    	
    	cars2.add(car3);
    	cars2.add(car4);
    	
    	
    	List<Department> departments2 = new ArrayList<Department>();
    	Department dep3 = new Department();
    	dep3.setId(3L);
    	dep3.setName("SALES");
    	
    	Department dep4 = new Department();
    	dep4.setId(4L);
    	dep4.setName("MARKETING");
    	
    	departments2.add(dep3);
    	departments2.add(dep4);
    	
    	Company comp2 = new Company();
    	comp2.setCars(cars2);
    	comp2.setId(2L);
    	comp2.setName("SANTANDER");
    	comp2.setDepartments(departments2);
    	
    	companys.add(comp1);
    	companys.add(comp2);
    	
        return companys;
    }

    
}
