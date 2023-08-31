package com.micro.servicedepartment.repository;

import com.micro.servicedepartment.client.EmployeeClient;
import com.micro.servicedepartment.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {

    @Autowired
    private EmployeeClient employeeClient;

    private List<Department> departments = new ArrayList<>();

    public Department addDepartment(Department department) {
        departments.add(department);
        return department;
    }

    public Department findById(Long id) {
        return departments.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst().get();
    }

    public List<Department> getAll() {
//        EmployeeClient employeeClient = new EmployeeClient();
        departments.forEach(department -> {
            department.setEmployees(employeeClient.getEmployeeByDeptId(department.getId()));
        });
        return departments;

    }
}
