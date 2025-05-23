package com.company;

public class Student {
    String name;
    int id;
    float cgpa;
    void display(){
        System.out.println("Name is" + this.name + "ID is" + this.id + "cgpa is" + this.cgpa);
    }
    void setvalue(String name, int id, float cgpa){
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    }
    float getsum(){
        return this.cgpa;
    }
}
