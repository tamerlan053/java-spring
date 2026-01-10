package com.tamerlan.springcore.rest;

import com.tamerlan.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllerTwo {

    private Coach myCoach;

    @Autowired
    public void setCoach(@Qualifier("trackCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkouttwo")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
