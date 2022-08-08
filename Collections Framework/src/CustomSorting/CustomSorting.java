package CustomSorting;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class sortingData<K, V>{
    private K key;
    private V value;

    public sortingData(K key, V value){
        super();
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Data [key = "+key+" value = "+ value +"]";
    }
}

public class CustomSorting {

    public static void main(String[] args) {
        Comparator<sortingData<Integer, String>> COMPARE_KEY = new Comparator<sortingData<Integer, String>>() {
            @Override
            public int compare(sortingData<Integer, String> obj1, sortingData<Integer, String> obj2) {
                if(obj1.getKey() < obj2.getKey())
                    return -1;
                else if (obj1.getKey() > obj2.getKey())
                    return 1;
                else
                    return 0;
            }
        };
        Set<sortingData<Integer, String>> set = new TreeSet<sortingData<Integer, String>>(COMPARE_KEY);

        set.add(new sortingData<Integer, String>(1, "one"));
        set.add(new sortingData<Integer, String>(4, "four"));
        set.add(new sortingData<Integer, String>(0, "zero"));
        set.add(new sortingData<Integer, String>(9, "nine"));
        set.add(new sortingData<Integer, String>(2, "two"));

        for(sortingData element:set)
        {
            System.out.println(element);
        }
    }
}
