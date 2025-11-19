/*
 * Activity 2.1.1
 */
import java.util.Scanner;

public class MinAndMax
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values in your sequence: ");
        int numValues = sc.nextInt();

        System.out.println("Enter your first value: ");
        int value = sc.nextInt();
        int min = value;
        int max = value;

        for (int i = 1; i < numValues; i++) {
            System.out.println("Enter your next value: ");
            value = sc.nextInt();

            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);


    }

}
