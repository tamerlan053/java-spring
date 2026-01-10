package com.tamerlan.springcore.rest;

import com.tamerlan.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllerThree {

    private Coach myCoach;

    @Autowired
    public DemoControllerThree(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkoutthree")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
