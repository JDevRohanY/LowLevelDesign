package org.lowleveldesign.solidPrinciple.designBird;

import org.lowleveldesign.solidPrinciple.designBird.bird.Pigeon;

public class Client {
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        pigeon.setName("Rocky");
        pigeon.setAge(2);
        pigeon.setColour("Grey");

        System.out.println(pigeon.getName());
        System.out.println(pigeon.getAge());
        System.out.println(pigeon.getColour());

        FlyingBirds flyer = pigeon;
        flyer.fly();
        pigeon.walk();
        pigeon.eat();
    }
}
