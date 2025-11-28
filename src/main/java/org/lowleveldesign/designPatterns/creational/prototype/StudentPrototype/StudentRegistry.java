package org.lowleveldesign.designPatterns.creational.prototype.StudentPrototype;

import org.lowleveldesign.designPatterns.creational.prototype.StudentPrototype.Batches;
import org.lowleveldesign.designPatterns.creational.prototype.StudentPrototype.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<Batches, Student> studentRegistry = new HashMap<>();
    public void register(Batches key, Student student){
        studentRegistry.put(key, student);
    }

    public Student get(Batches key){
        return studentRegistry.get(key);
    }
}
