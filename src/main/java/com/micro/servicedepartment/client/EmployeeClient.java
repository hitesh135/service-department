package com.micro.servicedepartment.client;


import com.micro.servicedepartment.model.Employee;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Component
public class EmployeeClient {

    @Autowired
    private RestTemplate restTemplate;

    public List<Employee> getEmployeeByDeptId(Long employeeId) {
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "http://localhost:8082/employee/findByDepartmentId/" + employeeId;
        String url = "http://SERVICE-EMPLOYEE/employee/findByDepartmentId/" + employeeId;
        ResponseEntity<List<Employee>> exchange = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Employee>>() {
        });
        return exchange.getBody();
    }
}
