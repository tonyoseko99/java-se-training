package com.systechafrica.part3;

import java.util.UUID;

public class StudentController {
    public void addStudent(Student student) throws Exception{
        if(student == null){
            throw new StudentDetailsMissingException("Student cannot be null");
        }
        student.setId(UUID.randomUUID().toString());
    }
    
}
