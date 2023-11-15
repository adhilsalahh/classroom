package com.example.classroom.Dto;

import com.example.classroom.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class TeacherStudentResponseDto {

    String teacherName;
    List<StudentResponse> studentResponseList=new ArrayList<>();
}
