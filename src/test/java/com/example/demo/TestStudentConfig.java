package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {
    @Autowired
    @Qualifier("students")
    Students students;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;



    @Test
    public void testCurrentStudents() {
        //given
        StudentConfig sc = new StudentConfig();
        Integer expected = 3;
        //when
        Integer actual = students.findAll().size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStudents() {
        //given
        StudentConfig sc = new StudentConfig();
        Integer expected = 3;
        //when
        Integer actual = previousStudents.findAll().size();
        //then
            Assert.assertEquals(expected,actual);
    }


}

