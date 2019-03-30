package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration

public class InstructorsConfig {
    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(31l, "Nhu"));
        instructorList.add(new Instructor(32l, "Kris"));
        instructorList.add(new Instructor(33l, "Leon"));

        return new Instructors(instructorList);
    }

    @Bean(name = "tcUKInstructors")
    public Instructors tcUKInstructors() {
        List<Instructor> instructorList1 = new ArrayList<>();
        instructorList1.add(new Instructor(41l, "Jutta"));
        instructorList1.add(new Instructor(42l, "Katja"));
        instructorList1.add(new Instructor(43l, "Harry"));

        return new Instructors(instructorList1);
    }

    @Bean(name = "instructors")
    public Instructors instructors() {
        List<Instructor> ukUsIntsructors = new ArrayList<>();
        ukUsIntsructors.addAll(tcUKInstructors().findAll());
        ukUsIntsructors.addAll(tcUsaInstructors().findAll());
        return new Instructors(ukUsIntsructors);
    }

}
