package com.example.classroom.Controller;

import com.example.classroom.Model.Teacher;
import com.example.classroom.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @PostMapping("/add")
    public Teacher add(@RequestBody Teacher teacher){
        return teacherService.addteacher(teacher);
    }
    @GetMapping("/get/{id}")
    public Teacher get(@PathVariable("id")int id){
        return teacherService.get(id);
    }

}
