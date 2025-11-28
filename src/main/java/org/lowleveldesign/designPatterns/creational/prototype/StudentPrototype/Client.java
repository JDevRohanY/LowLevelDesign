package org.lowleveldesign.designPatterns.creational.prototype.StudentPrototype;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        //Create a student object
        Student student1 = studentRegistry.get(Batches.NovemberEveningBatch25).clone();
        student1.setName("Rohan");
        student1.setAge(25);
        student1.setPsp(95.0);

        Student student2 = studentRegistry.get(Batches.NovemberEveningBatch25).clone();
        student2.setName("Rahul");
        student2.setAge(24);
        student2.setPsp(91.0);

        Student intelligentStudent = studentRegistry.get(Batches.DecemberMorningBatch25).clone();

        System.out.println("Debug");

    }
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student student = new Student();
        student.setBatch("NovemberEveningBatch25");
        student.setAvgBatchPsp(90.0);
        studentRegistry.register(Batches.NovemberEveningBatch25, student);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setBatch("DecemberMorningBatch25");
        intelligentStudent.setAvgBatchPsp(95.0);
        studentRegistry.register(Batches.DecemberMorningBatch25, intelligentStudent);
    }

}