package org.lowleveldesign.designPatterns.behavioral.stratergy.googleMaps;

public class PathFinderFactory {
    public static PathFinder getPathFinderForMode(MODE mode){
        if(mode.equals(MODE.CAR)){
            return new Car();
        }else if(mode.equals(MODE.BIKE)){
            return new Bike();
        }else if(mode.equals(MODE.BUS)){
            return new Bus();
        }else if(mode.equals(MODE.WALK)){
            return new Walk();
        }
        return null;
    }
}
