import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Vehicle{

    private int vehicleId;

    public Vehicle(int vehicleId){
        this.vehicleId = vehicleId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    @Override
    public String toString() {
        return "Vehicle [Vehicle Id = "+vehicleId+"]";
    }

    void info(){
        System.out.println("Vehicle ID is "+getVehicleId());
    }
}

class Car extends Vehicle{

    private String carModel;

    public Car(int vehicleId, String carModel) {
        super(vehicleId);
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "Car [Car Model = "+carModel+"]";
    }

    void info(){
        System.out.println("Car Model is "+getCarModel());
    }
}

public class WildCardClass {

    public static void main(String[] args) {

        List<Vehicle> list = new ArrayList<Vehicle>();

        // creating an object of Random class
        Random random = new Random();

        int id;
        for (int i=0; i<5; i++)
        {
            id = random.nextInt(1001);
            list.add(new Vehicle(id));
        }
        list.add(new Car(random.nextInt(1001), "TATA TIAGO"));
        display(list);
    }

    public static void display(List<? extends Vehicle> list)
    {
        for (Vehicle element:list){
            element.info();
        }
    }

}
