public class Bike extends Vehicle {

    private String handle;

    public Bike()
    {
        super();
        this.handle = "short";
    }

    public Bike(String handle)
    {
        super();
        this.handle = handle;
    }

    public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights)
    {
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }

    public String getHandle()
    {
        return  handle;
    }


    public String toString() {
        String returnString = "Bike [getEngine() = " + getEngine() + " , getWheels() = " + getWheels() + " , getSeats() = " + getSeats() + " , getFuelTank() = " + getFuelTank() + ", getLights() = " + getLights() + "]";
        return returnString;
    }
}
