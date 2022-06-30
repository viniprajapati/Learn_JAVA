public class Demo {

    public static void main(String[] args) {

        Bike bike = new Bike();
        System.out.println(bike.getHandle());
        System.out.println(bike.getEngine());
        System.out.println("====================================");
        Bike newBike = new Bike("long","Petrol",4,5,35,"LED");
        System.out.println("Handel : " + newBike.getHandle());
        System.out.println("Engine type : " +newBike.getEngine());
        System.out.println("Vehicle wheels : " + newBike.getWheels());
        System.out.println("Vehicle has seats : " + newBike.getSeats());
        System.out.println("Fuel tank : " + newBike.getFuelTank());
        System.out.println("Lights : " + newBike.getLights());
        System.out.println(bike);

        System.out.println("=====================================================");
        Car car = new Car();
        System.out.println(car.getSteering());
        System.out.println(car);

        System.out.println("=====================================================");
        Truck truck = new Truck();
        System.out.println(truck.getAirConditioner());
        System.out.println(truck);

    }
}
