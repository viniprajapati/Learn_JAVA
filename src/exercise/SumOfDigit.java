package exercise;
import java.util.Scanner;
public class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0)
        {
            int number = sc.nextInt();
            int sumofdigit = 0;

            while(number > 0)
            {
                sumofdigit += (number%10);
                System.out.println(number%10);
                number /= 10;
                System.out.println(number);
            }
            System.out.println("sum of digit : "+sumofdigit);
        }
    }
}
