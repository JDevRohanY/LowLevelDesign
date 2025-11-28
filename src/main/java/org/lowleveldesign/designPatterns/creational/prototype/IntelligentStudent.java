package org.lowleveldesign.designPatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent clone(){
        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setName(this.getName());
        intelligentStudent.setAge(this.getAge());
        intelligentStudent.setPsp(this.getPsp());
        intelligentStudent.setBatch(this.getBatch());
        intelligentStudent.setAvgBatchPsp(this.getAvgBatchPsp());
        intelligentStudent.iq = this.iq;
        return intelligentStudent;
    }
}
