/*
 * Activity 2.1.1
 */
import java.util.Scanner;

public class FrequencyCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // choose something to count in place of ...
        System.out.println("Enter a sentence and I will count the number of spaces. ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of spaces: " + count);


    }
}
