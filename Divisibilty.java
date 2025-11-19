/*
 * Activity 2.1.1
 */
import java.util.Scanner;

public class Divisibility
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero");
        } else {
            int temp = dividend;

            while (temp > 0) {
                temp = temp - divisor;
            }

            if (temp == 0) {
                System.out.println(dividend + " is divisible by " + divisor);
            } else {
                System.out.println(dividend + " is not divisible by " + divisor);
            }
        }


    }
}
