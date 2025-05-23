package com.company;

public class Teacher {
    String name;
    int id;
    float salary;

    void display() {
        System.out.println("Name is " + this.name + " ID is " + this.id + " cgpa is " + this.salary);
    }

    void setValue(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    float getsum() {
        return this.salary;
    }
}

