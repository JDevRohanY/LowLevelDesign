package org.lowleveldesign.designPatterns.creational.prototype.StudentPrototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IntelligentStudent extends Student {
    private int iq;
    IntelligentStudent(){

    }

    //Make constructor which take student as input param
    IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
