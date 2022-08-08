package Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {


        System.out.println("--------HashSet--------");
        Set<Integer> set = new HashSet<Integer>();
        for(int i=10; i >= 1; i--)
            set.add(i);
        for(Integer elem:set)
            System.out.println(elem);

        System.out.println("--------LinkedHashSet--------");
        Set<Integer> set1 = new LinkedHashSet<Integer>();
        for(int i=10; i >= 1; i--)
            set1.add(i);
        for(Integer elem:set1)
            System.out.println(elem);

        System.out.println("--------TreeSet--------");
        Set<Integer> set2 = new TreeSet<Integer>();
        for(int i=10; i >= 1; i--)
            set2.add(i);
        for(Integer elem:set2)
            System.out.println(elem);
    }
}
