package com.springboot.EMP.Dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.EMP.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
