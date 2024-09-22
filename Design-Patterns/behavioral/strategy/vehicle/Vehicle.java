package behavioral.strategy.vehicle;

public abstract class  Vehicle {
    private DriveStrategy driveStrategy;

    public void setDriveStrategy(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drivingMethod();
    }
}
