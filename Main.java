package com.MerveHoca.MEXT.Day_2;

public class Main {
    public static void main(String[] args) {
        Engineer employeeOne = new Engineer("Busra Tan", 85000, 28);
        Salesperson employeeTwo = new Salesperson("Sally Roberts", 25000, 34, .25);

        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getCommisionPercentage();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getCommisionPercentage());
    }
}
