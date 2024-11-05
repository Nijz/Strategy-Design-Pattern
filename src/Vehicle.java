import Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategyObj;

    // this is known as constructor injection
    public Vehicle(DriveStrategy driveStrategyObj){
        this.driveStrategyObj = driveStrategyObj;
    }

    public void drive(){
        driveStrategyObj.drive();
    }

}
