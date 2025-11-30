package org.lowleveldesign.designPatterns.behavioral.stratergy.googleMaps;

public class Bike implements PathFinder {

    @Override
    public void findPath(String source, String destination) {
        //Implement pathfinder for Bike
        System.out.printf("Finding Path for Bike : from  %s to %s", source, destination);
    }
}
