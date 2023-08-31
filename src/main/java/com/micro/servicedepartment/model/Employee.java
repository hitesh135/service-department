package com.micro.servicedepartment.model;

public class Employee {

    private Long id;

    private Long departmentId;

    private String name;

    private Integer age;

    private String position;

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", departmentId=" + departmentId + ", name='" + name + '\'' + ", age=" + age + ", position='" + position + '\'' + '}';
    }

    public Employee() {
    }

    public Employee(Long id, Long departmentId, String name, Integer age, String position) {
        this.id = id;
        this.departmentId = departmentId;
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
