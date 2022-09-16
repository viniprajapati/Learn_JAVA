package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map<Integer, String> student = new HashMap<Integer, String>();
        student.put(5, "Vini");
        student.put(8, "Priya");
        student.put(6, "Krupal");
        student.put(7, "Nidhi");
        student.put(4, "Harsh");
        student.put(2, "Megh");
        student.put(3, "Keta");
        student.put(1, "Setu");

        /*
        for(Map.Entry<Integer, String> elem:student.entrySet())
            System.out.println("ID : "+elem.getKey()+" || Name : "+elem.getValue());
        */

        /*
        for (Integer key:student.keySet())
            System.out.println("ID : "+key+" | Name : "+student.get(key));
        */

        // based on iterator
        Iterator<Map.Entry<Integer, String>> entryIterator = student.entrySet().iterator();
        while (entryIterator.hasNext())
        {
            Map.Entry<Integer, String> temp = entryIterator.next();
            System.out.println("ID : "+temp.getKey()+" | Name : "+temp.getValue());
        }
    }
}
