import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names>{

    private String names;

    public Names(String names) {
        this.names = names;
    }

    public int compareTo(Names o)
    {
        if(names.length() == o.names.length()) {
            return 0;
        }else if (names.length() < o.names.length()){
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
//        return "Names{" +
//                "names='" + names + '\'' +
//                '}';
        return names;
    }
}

public class App {

    public static void main(String[] args) {

        List<Names> names = new LinkedList();
        names.add(new Names("Vini"));
        names.add(new Names("Nidhi"));
        names.add(new Names("Harsh"));
        names.add(new Names("Megh"));
        names.add(new Names("Shiv"));
        App app = new App();
        app.printList(names);
        System.out.println("============Reverse the order===============");

        Collections.sort(names);
        app.printList(names );
    }

    void printList(List<Names> list)
    {
        ListIterator<Names> iterator = list.listIterator();
        while (iterator.hasNext())
        {
            System.out.println("Element : "+iterator.next());
        }
    }
}
