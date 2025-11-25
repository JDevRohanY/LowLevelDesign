package org.lowleveldesign.designPatterns.creational.builder;

import lombok.Getter;

@Getter
public class Student {
    private String name;
    private int age;
    private int rollNumber;
    private int batch;
    private double psp;
    //Constructor
    public Student(Builder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.rollNumber = builder.getRollNumber();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
    }
}
