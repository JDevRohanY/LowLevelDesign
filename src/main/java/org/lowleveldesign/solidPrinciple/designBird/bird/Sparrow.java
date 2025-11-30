package org.lowleveldesign.solidPrinciple.designBird.bird;

import org.lowleveldesign.solidPrinciple.designBird.Bird;
import org.lowleveldesign.solidPrinciple.designBird.FlyingBirds;

public class Sparrow extends Bird implements FlyingBirds {

    public void fly() {
        System.out.println("Sparrow Flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow Eating");
    }

    @Override
    public void walk() {
        System.out.println("Sparrow walking");
    }
}
