package com.example.classroom.Service;

import com.example.classroom.Model.Teacher;
import com.example.classroom.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    public Teacher addteacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }
    public Teacher get(int id){
        return teacherRepository.findById(id).get();
    }

}
