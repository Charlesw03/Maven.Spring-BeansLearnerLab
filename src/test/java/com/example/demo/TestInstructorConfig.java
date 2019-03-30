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
public class TestInstructorConfig {
    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @Autowired
    @Qualifier("tcUsaInstructors")
    Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUKInstructors")
    Instructors tcUKInstructors;

    @Test
    public void testUSAInstructors() {
        //given
        InstructorsConfig ic = new InstructorsConfig();
        Integer expected = 3;
        //when
        Integer actual = tcUsaInstructors.findAll().size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUKInstructors() {
        //given
        InstructorsConfig ic = new InstructorsConfig();
        Integer expected = 3;
        //when
        Integer actual = tcUKInstructors.findAll().size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstructors() {
        //given
        InstructorsConfig ic = new InstructorsConfig();
        Integer expected = 6;
        //when
        Integer actual = instructors.findAll().size();
        //then
            Assert.assertEquals(expected,actual);
    }


}
