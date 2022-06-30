package exercise;
import  java.util.Scanner;
public class CheckPrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n <= 1)
            System.out.println("Number is not prime number");
        else if(n%2 == 0)
            System.out.println("Number is not prime number");
        else if (n == 2)
            System.out.println("Number is prime number");
        else
        {
            int flag = 0;
            for (int i=3; i<= Math.sqrt(n) ; i+=2)
            {
                if(n%i == 0) {
                    System.out.println("Number is not prime number");
                    flag = 1;
                }
            }
            if(flag == 0)
                System.out.println("Number is prime number");
        }

    }
}
