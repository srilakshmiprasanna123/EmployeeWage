package com.bridgelabz.day8;

public class Employee {

    public static void main(String[] args) {
        System.out.println("Hello");
        Employee object = new Employee();
        object.Uc1();
    }
    public void Uc1() {
        int IS_FULL_TIME = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is Abscent");
    }
}
