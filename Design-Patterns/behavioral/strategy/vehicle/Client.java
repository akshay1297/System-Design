package behavioral.strategy.vehicle;

public class Client {
    public static void main(String[] args){
        Vehicle vehicle = new OffRoadVehicle();
        DriveStrategy driveStrategy = new SpecialDrivingStrategy();
        vehicle.setDriveStrategy(driveStrategy);
        vehicle.drive();


    }
}
