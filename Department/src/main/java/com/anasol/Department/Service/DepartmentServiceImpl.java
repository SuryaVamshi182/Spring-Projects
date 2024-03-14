package com.anasol.Department.Service;

import com.anasol.Department.Entity.Department;
import com.anasol.Department.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DepartmentServiceImpl implements DepartmentService{

 private DepartmentRepository departmentRepository;
 @Override
 public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
 }
}
