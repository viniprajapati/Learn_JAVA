package exercise;
import  java.util.Scanner;
// Type Casting exercise
public class Exercise {

    public static void main(String[] args) {

        // (a+b) square = (a*a) + 2*a*b + (b*b)
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        float value = a*a + 2*a*b + b*b;
        System.out.println("Value of the equation : "+value);
    }
}
