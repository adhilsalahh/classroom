package com.example.classroom.Service;

import com.example.classroom.Dto.StudentRequest;
import com.example.classroom.Dto.StudentResponse;
import com.example.classroom.Model.Student;
import com.example.classroom.Model.Teacher;
import com.example.classroom.Repository.StudentRepository;
import com.example.classroom.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeacherRepository teacherRepository;

    public Student add(Student student){
        return studentRepository.save(student);
    }

    public String pair(StudentRequest studentRequest){
        Student student=studentRepository.findById(studentRequest.getStudentId()).get();
        Teacher teacher=teacherRepository.findById(studentRequest.getTeacherId()).get();


//
//        List<Student>students=teacher.getStudents();
//        students.add(student);
//
//
//        teacher.setStudents(students);
//        student.setTeacher(teacher);
//
//        studentRepository.save(student);
//

        return "Successfull";

    }

}
