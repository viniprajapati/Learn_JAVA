import java.util.ArrayList;
import java.util.List;

class DataClass{

    public<E> void printList(List<E> list)
    {
        for(E ele:list){
            System.out.println(ele);
        }
    }

    public<E> void printArrayData(E[] arrayData){
        for(E elem:arrayData){
            System.out.println(elem);
        }
    }

}

public class GenericsMethod {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0 ; i < 5 ; i++)
            list1.add(i+1);

        DataClass obj = new DataClass();
        System.out.println("List of integer data");
        obj.printList(list1);
        System.out.println("===================================");

        List<String> list2 = new ArrayList<String>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        list2.add("four");
        list2.add("five");

        System.out.println("List of string data");
        obj.printList(list2);
        System.out.println("===================================");

        String[] stringArr = {"hi", "hy", "hello"};
        System.out.println("String array");
        obj.printArrayData(stringArr);
        System.out.println("===================================");

        Integer[] intArr = {12, 13, 14};
        System.out.println("Integer array");
        obj.printArrayData(intArr);
        System.out.println("===================================");

        Double[] doubleArr = {10.2, 22.5};
        System.out.println("Double aaray");
        obj.printArrayData(doubleArr);
    }
}
