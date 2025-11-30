package org.lowleveldesign.designPatterns.behavioral.stratergy.googleMaps;

public class Car implements PathFinder {
    @Override
    public void findPath(String source, String destination) {
        //Implement pathFinder for Car
        System.out.printf("Finding Path for Car : from  %s to %s", source, destination);
    }
}
