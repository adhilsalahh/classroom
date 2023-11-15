package com.example.classroom.Model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.apache.logging.log4j.Level;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teacher")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int TeacherId;
    String Name;
    String MobNo;
    String Subject;

    @OneToMany(mappedBy="teacher",cascade = CascadeType.ALL)
    List<Student> students=new ArrayList<>();




}
