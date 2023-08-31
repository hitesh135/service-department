package com.micro.servicedepartment.controller;

import com.micro.servicedepartment.model.Department;
import com.micro.servicedepartment.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping("add")
    public Department addDepartment(@RequestBody Department department) {
        LOGGER.info("START addDepartment()");
        return departmentRepository.addDepartment(department);
    }

    @GetMapping("{id}")
    public Department findById(@PathVariable("id") Long id) {
        LOGGER.info("START findById() for id : {}", id);
        return departmentRepository.findById(id);
    }

    @GetMapping("getAll")
    public List<Department> getAll() {
        LOGGER.info("START getAll()");
        return departmentRepository.getAll();
    }

}
