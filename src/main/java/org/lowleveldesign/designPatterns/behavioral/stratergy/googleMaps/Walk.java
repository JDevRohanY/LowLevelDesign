package org.lowleveldesign.designPatterns.behavioral.stratergy.googleMaps;

public class Walk implements PathFinder {
    @Override
    public void findPath(String source, String destination) {
        //Implement pathfinder for walk
        System.out.printf("Finding Path for Walk : from  %s to %s", source, destination);
    }
}
