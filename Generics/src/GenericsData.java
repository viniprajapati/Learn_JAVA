import java.util.LinkedList;
import java.util.List;

class Data1<T>{
    private T var;

    public Data1(T var){
        super();
        this.var = var;
    }

    public T getVar(){
        return var;
    }

    @Override
    public String toString() {
        return "Data1 [var = "+var+"]";
    }
}

public class GenericsData {

    public static void main(String[] args) {

        List<Data1> elements = new LinkedList<Data1>();
//        List<Data1<T>> elements = new LinkedList<Data>();
        elements.add(new Data1("hhshsfhfhsjfhsjhfsjfjs"));
        elements.add(new Data1(1.1));
        elements.add(new Data1<Object>(1));
        System.out.println(elements);
    }
}
