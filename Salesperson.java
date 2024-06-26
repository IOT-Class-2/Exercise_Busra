package com.MerveHoca.MEXT.Day_2;

public class Salesperson extends Employee{

    // 'extends' Employee, Engineer classını(sınıfının) Employee sınıfından miras aldığını belirtir.
    // Employee' sınfından miras aldığını belirtir. Yani 'Engineer' sınıfının tüm özelliklerine ve metotlarını sahip olur.

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
