package com.example.utkarsh.employeeMVCProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.utkarsh.employeeMVCProject.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {

}
