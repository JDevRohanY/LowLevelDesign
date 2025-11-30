package org.lowleveldesign.designPatterns.behavioral.stratergy.googleMaps;

public class Bus implements PathFinder {
    @Override
    public void findPath(String source, String destination) {
        //Implement PathFinder for Bus
        System.out.printf("Finding Path for Bus : from  %s to %s", source, destination);
    }
}
