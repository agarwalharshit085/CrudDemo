package com.example.crud.crudoperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Transactional
    public Student getStudentById(Long regNo) {
        return studentRepository.findById(regNo).orElse(null);
    }
    @Transactional
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    @Transactional
    public void deleteStudent(Long regNo) {
        studentRepository.deleteById(regNo);
    }
}

