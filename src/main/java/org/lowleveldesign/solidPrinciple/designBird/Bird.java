package org.lowleveldesign.solidPrinciple.designBird;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public abstract class Bird {
    private String name;
    private int age;
    private String colour;
    private String type;

    public abstract void eat();
    public abstract void walk();
}
