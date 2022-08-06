import java.util.Random;
import java.util.Scanner;

class Data3<T extends Comparable<T>> implements Comparable<T>{

    private T myVariable;

    public Data3(T myVariable){
        super();
        this.myVariable = myVariable;
    }

    public T getMyVariable(){
        return myVariable;
    }

    @Override
    public String toString() {
        return "Data [myVariable = "+myVariable+"]";
    }

    @Override
    public int compareTo(T o) {
        return getMyVariable().compareTo(o);
    }
}

public class ComparableInterface {

    public static void main(String[] args) {

        // creating an object of Random class
        Random random = new Random();

        // creating an object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Generates random integers 0 to 50
        int number =  random.nextInt(51);

        Data3<Integer> obj = new Data3<Integer>(number);
        System.out.println("Guess the number between 0 to 50, which system is set");
        System.out.println("Number of times you want to attempt");
        int attempt = sc.nextInt();
        System.out.println("You can attempt "+attempt+" times");
        System.out.println("-----------------*************-----------------");

        int guessedNumber, result,count = 0,leftAttempt;
        do{
            System.out.println("Try your luck, Enter the number");
            guessedNumber = sc.nextInt();
            result = obj.compareTo(guessedNumber);
            count++;
            leftAttempt = attempt-count;
            if(result != 0 && leftAttempt != 0)
            {
                System.out.println("Left "+leftAttempt+" attempt");
            }
        }while (result != 0 && count <5);

        System.out.println("-----------------*************-----------------");
        if(result == 0 && count <= 5)
        {
            System.out.println("Congratulation!! You guess the number");
        }
        else
        {
            System.out.println("Oops!!, Try again to win");
        }

    }
}
