package com.maximgeier.spring.springboot.spring_data_rest.dao;


import com.maximgeier.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByName(String name);
    List<Employee> findEmployeeBySalaryBetween(int minSalary, int maxSalary);
}