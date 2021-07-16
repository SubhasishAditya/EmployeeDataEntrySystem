package com.example.webapp3.Service;

import com.example.webapp3.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo  extends CrudRepository<Employee,Integer> {
}
