package com.example.classroom.Controller;

import com.example.classroom.Dto.StudentRequest;
import com.example.classroom.Dto.StudentResponse;
import com.example.classroom.Model.Student;
import com.example.classroom.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public Student add(@RequestBody Student student){
        return studentService.add(student);
    }
    @PutMapping ("/pair")
    public String pair(@RequestBody StudentRequest studentRequest){
        return studentService.pair(studentRequest);
    }






}
