package creational.builder.carbuilder;

/*
Builder design pattern : Creational design pattern
- Step by step object creation
- Why static keyword is used ????
    - A non-static inner class (i.e., an inner class without the static keyword) would implicitly hold a reference to an instance of the outer class (Car).
    This reference is unnecessary because the builder’s purpose is to build the Car instance,
     and it doesn’t need access to any instance of the Car class until the object is being built.
    - Having a static inner builder class means you can create the builder without needing to first instantiate the outer class.
    - If CarBuilder were not static, you would need an instance of Car to access CarBuilder,
     which would defeat the purpose of using a builder for object construction.
    - If it's not static :
         Car carInstance = new Car();
         CarBuilder builder = carInstance.new CarBuilder();

     - Constructor of the original class will be private and only accept inner Builder class object


Problems :
-When there is too many optional fields in a class
- When size of constructor parameters is huge

Disadvantages :
 - both original and builder class have same number of parameters - makes code redundant

 Director :
 - it will make sure fields are set in particular order
 */

public class Car {
    private Integer model;
    private String name;
    private boolean sunroof;
    private String engine;
    private String colour;

    private Car(CarBuilder carBuilder) {
        this.model = carBuilder.model;
        this.colour = carBuilder.colour;
        this.name = carBuilder.name;
        this.engine = carBuilder.engine;
    }

    public static class CarBuilder {
        private Integer model;
        private String name;
        private boolean sunroof;
        private String engine;
        private String colour;

        // Required properties (Constructor) and Optional properties (through setter)
        public CarBuilder(String name, Integer model, String engine) {
            this.name = name;
            this.model = model;
            this.engine = engine;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

