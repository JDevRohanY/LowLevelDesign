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
        //Validation start
        if(builder.getBatch() >= 2024){
            throw new RuntimeException("Only students which are of batch 2023 or less are acceptable.");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.rollNumber = builder.getRollNumber();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
    }
}
