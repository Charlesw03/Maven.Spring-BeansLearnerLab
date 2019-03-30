package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {
    @Autowired
    @Qualifier("previousStudents")
    Students students;


    @Autowired
    @Qualifier("instructors")
    Instructors instructors;


    @PostConstruct
    public void executeBootcamp() {
        for(Student students:students){
            students.learn(1200.0);
        }

    }


    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

}
