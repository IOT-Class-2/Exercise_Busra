package com.MerveHoca.MEXT.Day_2;

public class Engineer extends Employee {
    public Engineer(String name, double salary, int age) {
        super(name, salary, age);
    }
public double getAnnualBonus(){
        return super.salary * .05;
    }
}

