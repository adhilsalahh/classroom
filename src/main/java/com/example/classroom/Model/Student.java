package com.example.classroom.Model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "student")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int StudentId;
    @Column (unique = true)
    String name;
    String MobNo;
    String Subject;

    @ManyToOne
    @JoinColumn
    Teacher teacher;

}
