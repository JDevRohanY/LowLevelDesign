package org.lowleveldesign.designPatterns.creational.builder.carBuilder;

public class Client {
    public static void main(String[] args) {
        Car car = Car.builder()
                .setEngineType("Petrol")
                .setColor("Black")
                .setSunroof(true)
                .setNavigationSystem(true)
                .setSoundSystem("JBL")
                .build();

        System.out.println(car.toString());
    }
}
