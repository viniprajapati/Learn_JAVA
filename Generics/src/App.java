class Data{

    private Object obj;

    public Data(Object obj){
        this.obj = obj;
    }

    public Object getObj(){
        return obj;
    }

    @Override
    public String toString() {
        return "Data [obj = "+obj+"]";
    }
}

class GenericClass<T>{
    private T data;

    public GenericClass(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }
}

public class App {

    public static void main(String[] args) {

        Data data = new Data("Some data");
        String var = (String) data.getObj();
        System.out.println(var);

        System.out.println("===========Generic DataType===========");

        GenericClass<String> genericData = new GenericClass<String>("generic data string");
        String var1 = genericData.getData();
        System.out.println(var1);
        GenericClass<Integer> genericData1 = new GenericClass<Integer>(123);
        int var2 = genericData1.getData();
        System.out.println(var2);
    }
}
