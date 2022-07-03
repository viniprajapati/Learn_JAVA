public class Phone {

    private String model;

    public Phone(String model)
    {
        this.model = model;
    }

    public void features()
    {
        System.out.println("Long-lasting battery and power sharing");
    }

    public String getModel()
    {
        return model;
    }
}
