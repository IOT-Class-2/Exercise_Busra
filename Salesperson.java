package com.MerveHoca.MEXT.Day_2;

public class Salesperson extends Employee{
    private double commisionPercentage;
    public Salesperson(String name, double salary, int age,
                       double commisionPercentage){
        super(name,salary,age);
        this.commisionPercentage = commisionPercentage;
    }

    public double getCommisionPercentage() {
        return this.commisionPercentage;
    }
    public void raiseCommision(){
        if (this.commisionPercentage < .30){
            this.commisionPercentage = this.commisionPercentage * 1.2;
        }
    }
}
