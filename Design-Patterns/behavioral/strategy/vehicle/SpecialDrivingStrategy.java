package behavioral.strategy.vehicle;

public class SpecialDrivingStrategy implements DriveStrategy{
    @Override
    public void drivingMethod() {
        System.out.println("This is a special driving method applied on special model of vehicle.");

    }
}
