package com.example.crud.crudoperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{regNo}")
    public Student getStudentById(@PathVariable Long regNo) {
        return studentService.getStudentById(regNo);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping("/{regNo}")
    public Student updateStudent(@PathVariable Long regNo, @RequestBody Student student) {
        student.setRegNo(regNo);
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/{regNo}")
    public void deleteStudent(@PathVariable Long regNo) {
        studentService.deleteStudent(regNo);
    }
}
