public class Truck extends Vehicle {

    private String steering;
    private String musicSystem;
    private String airConditioner;

    public Truck()
    {
        super();
        this.steering = "electric power hydraulic steering";
        this.musicSystem = "Sony DSX-A410BT";
        this.airConditioner = "non-ac";
    }

    public Truck(String airConditioner, String engine, int wheels, int seats, int fuelTank, String lights)
    {
        super(engine, wheels, seats, fuelTank, lights);
        this.airConditioner = airConditioner;
    }

    public String getAirConditioner()
    {
        return airConditioner;
    }


    public String toString() {
        String returnString = "Truck [getEngine() = " + getEngine() + " , getWheels() = " + getWheels() + " , getSeats() = " + getSeats() + " , getFuelTank() = " + getFuelTank() + ", getLights() = " + getLights() + "]";
        return returnString;
    }
}
