package org.lowleveldesign.designPatterns.creational.builder.studentBuilder;

public class Client {
    public static void main(String[] args) {
        //Builder builder = new Builder();

        /*
        Student.Builder builder = Student.getBuilder();
        builder.setName("Rohan");
        builder.setAge(25);
        builder.setPsp(95.0);
        builder.setBatch(2018);
        builder.setRollNumber(174);
        Student student = builder.build();
        */

        Student student1 = Student.getBuilder()
                        .setName("Rohan")
                        .setAge(25)
                        .setPsp(95.0)
                        .setBatch(2018)
                        .setRollNumber(174)
                        .build();

        System.out.println("Name : " + student1.getName());
        System.out.println("Age : " + student1.getAge());

    }
}
