package org.lowleveldesign.solidPrinciple.designBird.bird;

import org.lowleveldesign.solidPrinciple.designBird.Bird;
import org.lowleveldesign.solidPrinciple.designBird.FlyingBirds;

public class Pigeon extends Bird implements FlyingBirds {
    public void fly() {
        System.out.println("Pigeon Flying");
    }

    @Override
    public void eat() {
        System.out.println("Pigeon Eating");
    }

    @Override
    public void walk() {
        System.out.println("Pigeon Walking");
    }
}
