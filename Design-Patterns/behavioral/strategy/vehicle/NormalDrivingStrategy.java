package behavioral.strategy.vehicle;

public class NormalDrivingStrategy implements DriveStrategy{
    @Override
    public void drivingMethod() {
        System.out.println("This is a normal driving method applied on base model of vehicle.");

    }
}
