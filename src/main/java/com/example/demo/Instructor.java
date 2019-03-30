package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners,double numberOfHours) {

        List<Learner> stuList = new ArrayList<>();
        learners.forEach(learner->stuList.add(learner));
        Double numberOfHoursPerLearner = numberOfHours / stuList.size();
        for (Learner students: stuList) {
                students.learn(numberOfHoursPerLearner);
        }

    }
}
