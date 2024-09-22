package creational.builder.carbuilder;

public class CarBuilderDemo {

    public static void main(String[] args){
        Car car = new Car.CarBuilder("Verna", 12, "VernaEngine")
                         .setSunroof(true)
                         .setColour("white")
                         .build();

         // Car car1 = new Car(); - can't create object because constructor is private and only accessible to carBuilder inner class
        /*
            - This step-wise calling setters is called "a fluent API style of coding".
            - To achieve this , we have returned "this" from all the setters.
         */

        System.out.println(car);
    }

}
