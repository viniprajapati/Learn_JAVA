import java.util.ArrayList;
import java.util.Scanner;
public class App {

    static ArrayList<String> listNames = new ArrayList<String>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number of name want to add");
        int n = sc.nextInt();
        for(int i = 0; i < n ; i++)
        {
            listNames.add(sc.next());
        }
//        listNames.add("Vini");
//        listNames.add("Nidhi");
//        listNames.add("Megh");
//        listNames.add("Harsh");
//        listNames.add("Dia");
//        listNames.add("Priya");
//        listNames.add("Shiv");
//        listNames.add("Vidhisa");
//        System.out.println(listNames);

        System.out.println("***********Display all the name************");
        App app = new App();
        app.displayList(listNames);

        System.out.println("***********Remove name by position************");
        System.out.println("Enter position from where you want to remove name(Position between 0 to "+n+")");
        int pos = sc.nextInt();
        if(pos >= 0 || pos < n)
        {
            app.removeNameByPosition(pos);
            app.displayList(listNames);
        }
        else
        {
            System.out.println("Invalid position");
        }

        System.out.println("***********Remove name by string************");
        System.out.println("Enter name which you want to remove from list");
        boolean status = app.removeNameByString(sc.next());
        if(status == true)
        {
            System.out.println("Name removed successfully");
            app.displayList(listNames);
        }
        else
        {
            System.out.println("Name does not exists in the list");
        }

//        listNames.add("Priya");
//        listNames.add("Priya");
//        app.removeNameByString("Priya");
//        System.out.println("***********Remove Name when two name are same************");
//        app.displayList(listNames);

        System.out.println("**********Modify Name*************");
        System.out.println("Enter position and new name to modify list");
        int post = sc.nextInt();
        String newName = sc.next();
        if(post >= 0 || post < n)
        {
            app.modifyName(post, newName);
            app.displayList(listNames);
        }
        else
        {
            System.out.println("Invalid position");
        }


        System.out.println("**********Find name in list*************");
        String name = sc.next();
        int index = app.search(name);
        if(index != -1)
        {
            System.out.println("Enter new name");
            String nName = sc.next();
            app.modifyName(index, nName);
            System.out.println("Index for search value \""+name+"\" is :"+index+" And set new value : "+nName);
            app.displayList(listNames);
        }
        else
        {
            System.out.println("Invalid entry");
        }
//        System.out.println("Index for search value \"harsh\" is :"+app.search("harsh"));

    }

    void displayList(ArrayList<String> names)
    {
        for(String name: names)
        {
            System.out.println(name);
        }
    }

    void removeNameByPosition(int position)
    {
        listNames.remove(position);
    }

    boolean removeNameByString(String name)
    {
        return listNames.remove(name);

    }

    void modifyName(int position, String newName)
    {
        listNames.set(position, newName);
    }

    int search(String name)
    {
        return listNames.indexOf(name);
    }
}
