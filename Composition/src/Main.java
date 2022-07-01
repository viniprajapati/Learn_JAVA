import laptop.Laptop;

public class Main {

    public static void main(String[] args) {

        Laptop lappy = new Laptop();
        System.out.println(lappy.getProcessor().getBrand());

        lappy.getProcessor().setBrand("Xeon lines");
        System.out.println(lappy.getProcessor().getBrand());

        lappy.setProcessor(lappy.getProcessor());
        System.out.println(lappy.getProcessor());
    }
}
