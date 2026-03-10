package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {

    @PostMapping("/average")
    public String total(@RequestBody Demo marks) {

        int m1 = marks.getM1();
        int m2 = marks.getM2();

        double avg = (m1 + m2) / 2.0;

        if (avg > 75) {
            return "Average = " + avg + " Eligible";
        } else {
            return "Average = " + avg + " Not Eligible";
        }
    }
}

class Demo {

    
    private int m1;
    private int m2;

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }
}

