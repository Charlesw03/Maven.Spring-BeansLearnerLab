package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student(11l, "Mctina"));
        studentsList.add(new Student(12l, "Marci"));
        studentsList.add(new Student(13l, "Chalie"));

        return new Students(studentsList);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        List<Student> studentsList1 = new ArrayList<>();
        studentsList1.add(new Student(21l, "Ed"));
        studentsList1.add(new Student(22l, "Edd"));
        studentsList1.add(new Student(23l, "Eddy"));

        return new Students(studentsList1);
    }


}
