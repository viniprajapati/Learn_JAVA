import java.util.ArrayList;
import java.util.List;

class Data1{
    private String name;

    public Data1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
public class LambdaWithIterations {
    public static void main(String[] args) {

        List<Data> list = new ArrayList<>();
        list.add(new Data("Bairstow"));
        list.add(new Data("Dhoni"));
        list.add(new Data("Virat"));
        list.add(new Data("Phillip"));
        list.add(new Data("Mic"));

        list.forEach(i-> {
            System.out.println(i);
        });
    }
}
