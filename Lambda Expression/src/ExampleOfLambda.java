import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{
    private String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class ExampleOfLambda {
    public static void main(String[] args) {

        List<Data> list = new ArrayList<>();
        list.add(new Data("vini"));
        list.add(new Data("nidhi"));
        list.add(new Data("harsh"));
        list.add(new Data("megh"));
        list.add(new Data("shiv"));

        /*
        Collections.sort(list, new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        */

        Collections.sort(list, (Data o1, Data o2)->{
            if (o1.getName().length() < o2.getName().length()){
                return -1;
            }else if (o1.getName().length() > o2.getName().length()){
                return 1;
            }else {
                return 0;
            }
        });

        for (Data data:list) {
            System.out.println(data);
        }
    }
}
