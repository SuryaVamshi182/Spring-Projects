package com.anasol.Department.Entity;


import com.anasol.Department.Service.DepartmentService;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int departmentId;

    @Autowired
    private String departmentName;

    @Autowired
    private String departmentCity;

    @Autowired
    private int departmentCode;
    }

}
