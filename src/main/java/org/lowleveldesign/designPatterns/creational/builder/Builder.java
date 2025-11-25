package org.lowleveldesign.designPatterns.creational.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Builder {
    private String name;
    private int age;
    private int rollNumber;
    private int batch;
    private double psp;

    public Student build(){
        //Do validation here
        //Validation start
        if(this.getBatch() >= 2024){
            throw new RuntimeException("Only students which are of batch 2023 or less are acceptable.");
        }
        return new Student(this);
    }
}
