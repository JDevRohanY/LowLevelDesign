package org.lowleveldesign.designPatterns.behavioral.stratergy.googleMaps;

public class Client {
    public static void main(String[] args) {
        GoogleMap googleMap = new GoogleMap();
        googleMap.findPath("Delhi", "Bangalore", MODE.BIKE);
    }
}
