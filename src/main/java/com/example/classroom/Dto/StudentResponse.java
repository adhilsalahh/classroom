package com.example.classroom.Dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentResponse {
    String Name;
    String MobNo;
}
