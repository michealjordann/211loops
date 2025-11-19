/*
 * Activity 2.1.1
 */
import java.util.Scanner;

public class GetDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer to see its digits: ");
        int num = sc.nextInt();
        while (num > 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;


        }
    }

}
