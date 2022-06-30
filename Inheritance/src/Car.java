public class Car extends Vehicle {

    private String steering;
    private String musicSystem;
    private String airConditioner;
    private String fridge;
    private String entertainementSystem;

    public Car() {

        super();
        this.steering = "hydraulic power steering";
        this.musicSystem = "Pioneer";
        this.airConditioner = "Yes";
        this.fridge = "no";
        this.entertainementSystem = "music system";
    }

    public Car(String steering, String engine, int wheels, int seats, int fuelTank, String lights)
    {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
    }

    public String getSteering()
    {
        return steering;
    }

    public String toString() {
        String returnString = "Car [getEngine() = " + getEngine() + " , getWheels() = " + getWheels() + " , getSeats() = " + getSeats() + " , getFuelTank() = " + getFuelTank() + ", getLights() = " + getLights() + "]";
        return returnString;
    }
}
