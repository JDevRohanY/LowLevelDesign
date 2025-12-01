package org.lowleveldesign.designPatterns.creational.builder.carBuilder;

public class Car {
    private String engineType;
    private String color;
    private boolean sunroof;
    private boolean navigationSystem;
    private String soundSystem;

    //Now there will be a constructor which will take Builder as input
    //Make it private so that car constructor can only be called through builder
    private Car(Builder builder){
        this.engineType = builder.engineType;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
        this.navigationSystem = builder.navigationSystem;
        this.soundSystem = builder.soundSystem;
    }

    //Now car should be responsible for builder also,
    //To call this function from outside without an object creation
    //we need to make this method static
    public static Builder builder(){
        return new Builder();
    }


    // Will make a builder class first
    public static class Builder {
        // It's going to have all the parameter of car class
        private String engineType;
        private String color;
        private boolean sunroof;
        private boolean navigationSystem;
        private String soundSystem;

        public Builder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Builder setNavigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Builder setSoundSystem(String soundSystem) {
            this.soundSystem = soundSystem;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car {" +
                "engineType='" + engineType + '\'' +
                ", color='" + color + '\'' +
                ", sunroof=" + sunroof +
                ", navigationSystem=" + navigationSystem +
                ", soundSystem='" + soundSystem + '\'' +
                '}';
    }
}
