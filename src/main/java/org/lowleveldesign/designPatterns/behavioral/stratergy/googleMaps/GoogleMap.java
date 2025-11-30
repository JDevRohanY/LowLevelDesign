package org.lowleveldesign.designPatterns.behavioral.stratergy.googleMaps;

public class GoogleMap {
    PathFinder pathFinder;
    public void findPath(String source, String destination, MODE mode){
        pathFinder = PathFinderFactory.getPathFinderForMode(mode);
        pathFinder.findPath(source, destination);
    }
}
