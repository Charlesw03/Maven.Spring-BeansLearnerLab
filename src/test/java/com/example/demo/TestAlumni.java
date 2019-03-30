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
public class TestAlumni {
    @Autowired
  Alumni alumni;

    @Test
    public void testExecuteBootCamp(){
        //given
        Assert.assertEquals(1200,alumni.getStudents().findById(21l).getTotalStudyTime(),0.0);


        //then

    }


}
