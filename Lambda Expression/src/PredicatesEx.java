import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicatesEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<5; i++)
            arr[i] = sc.nextInt();
        IntPredicate lessThan18 = new IntPredicate() {
            @Override
            public boolean test(int value) {
                if (value < 18)
                    return true;
                else
                    return false;
            }
        };

        for (int i=1; i<5; i++){
            if (lessThan18.test(arr[i]))
                System.out.println("Value "+arr[i]+" is less than 18");
            else
                System.out.println("Value "+arr[i]+" is greater than 18");
        }

        System.out.println("**********************");
        /*Predicates with lambda expression*/
        IntPredicate LessThan18 = i->i<18;
        IntPredicate MoreThan5 = i->i>5;

        for (int i=1; i<5; i++){
            if (LessThan18.and(MoreThan5).test(arr[i]))
                System.out.println("Value "+arr[i]+" is less than 18 and greater than 5");
            else
                System.out.println("Value "+arr[i]+" is not less than 18 and greater than 5");

        }
        System.out.println("**********************");
        for (int i=1; i<5; i++){
            new PredicatesEx().demo(arr[i],LessThan18,MoreThan5);
        }
    }
    public void demo(int x, IntPredicate lessThan18, IntPredicate MoreThan5){
        if(lessThan18.and(MoreThan5).test(x))
            System.out.println("Value "+x+" is less than 18 and greater than 5");
        else
            System.out.println("Value "+x+" is not less than 18 and greater than 5");
    }
}