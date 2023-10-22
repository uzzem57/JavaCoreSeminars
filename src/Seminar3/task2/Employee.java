package Seminar3.task2;

import java.util.Date;

public class Employee {

    private String birthDate;
    private String name;
    private String midName;
    private String surName;
    private int salary;

    public Employee(String name, String midName, String surName, int salary, String birthDate) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }



}

