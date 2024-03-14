package com.adp.OwnApplication.api;

import com.adp.OwnApplication.Entity.Student;
import com.adp.OwnApplication.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/students")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        Student savedStudent=studentRepo.save(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id){
        return studentRepo.findById(id);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        studentRepo.deleteById(id);
        return ResponseEntity.ok("Deleted Student Successfully with studentID:" + id);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<String> updateFirstName(@PathVariable Long id, @RequestBody Student updatedstudent){
        Optional<Student> optionalStudent = studentRepo.findById(id);
        Student existingStudent = optionalStudent.get();
        existingStudent.setFirstName(updatedstudent.getFirstName());
        existingStudent.setLastName(updatedstudent.getLastName());
        existingStudent.setSalary(updatedstudent.getSalary());
        Student savedStudent = studentRepo.save(existingStudent);
        return ResponseEntity.ok("Updated Student Successfully");
    }
}
