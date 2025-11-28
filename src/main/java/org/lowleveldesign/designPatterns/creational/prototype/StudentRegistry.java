package org.lowleveldesign.designPatterns.creational.prototype;

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
