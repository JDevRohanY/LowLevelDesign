package org.lowleveldesign.designPatterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Rohan");
        builder.setAge(25);
        builder.setPsp(95.0);
        builder.setBatch(2018);
        builder.setRollNumber(174);

        Student student = builder.build();
        System.out.println(student.getName());
    }
}
