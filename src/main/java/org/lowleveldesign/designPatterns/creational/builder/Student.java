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
    // If you want client to use builder, u need to make this constructor private
    private Student(Builder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.rollNumber = builder.getRollNumber();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private int rollNumber;
        private int batch;
        private double psp;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public Builder setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public int getBatch() {
            return batch;
        }

        public Builder setBatch(int batch) {
            this.batch = batch;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build(){
            //Do validation here
            //Validation start
            if(this.getBatch() >= 2024){
                throw new RuntimeException("Only students which are of batch 2023 or less are acceptable.");
            }
            return new Student(this);
        }
    }
}
