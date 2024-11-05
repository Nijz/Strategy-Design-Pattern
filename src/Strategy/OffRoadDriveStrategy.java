package Strategy;

public class OffRoadDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Driving mode: Off-road");
    }

}
