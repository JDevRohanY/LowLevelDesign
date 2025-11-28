package org.lowleveldesign.designPatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private String batch;
    private double psp;
    private double avgBatchPsp;

    @Override
    public Student clone() {
        Student student = new Student();
        student.name = this.name;
        student.age = this.age;
        student.batch = this.batch;
        student.psp = this.psp;
        student.avgBatchPsp = this.avgBatchPsp;
        return student;
    }
}
