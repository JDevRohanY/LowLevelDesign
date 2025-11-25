package org.lowleveldesign.designPatterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        //Builder builder = new Builder();

        Student.Builder builder = Student.getBuilder();
        builder.setName("Rohan");
        builder.setAge(25);
        builder.setPsp(95.0);
        builder.setBatch(2018);
        builder.setRollNumber(174);

        Student student = builder.build();
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());

    }
}
