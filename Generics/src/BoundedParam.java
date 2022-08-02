class Data2<K extends Integer, V extends BoundedParam>{

    private K key;
    private V value;
    public Data2(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data2{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public <E extends Character, N extends Number> void display(E element, N number){
        System.out.println("Element : "+element+" Number : "+number);
    }
}
public class BoundedParam {

    public static void main(String[] args) {

        Data2<Integer, BoundedParam> data = new Data2<Integer, BoundedParam>(1, new BoundedParam());
        data.display('A',1);
        data.getValue().test();
        System.out.println(data.getKey());
        System.out.println(data.getValue().test1());
        System.out.println(data.getKey());
    }

    public void test(){
        System.out.println("Testing.....");
    }

    public String test1(){
        return "vini";
    }

}
