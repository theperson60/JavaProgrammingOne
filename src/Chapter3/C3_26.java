package Chapter3;

import java.util.Scanner;

/**
 * Decides if an integer is divisible by 5 and 6
 *
 * @author Apples Logan
 */
public class C3_26
{

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter an integer >>> ");
        number = input.nextInt();
        boolean result1;
        boolean result2;
        boolean result3 = false;

        if ((number % 5 == 0) && (number % 6 == 0))
        {
            result1 = true;
        } else
        {
            result1 = false;
        }

        if ((number % 5 == 0) || (number % 6 == 0))
        {
            result2 = true;
        } else
        {
            result2 = false;
        }

        if ((number % 5 == 0) || (number % 6 == 0))
        {
            if ((number % 5 == 0) && (number % 6 == 0))
            {
                result3 = false;
            } else
            {
                result3 = true;
            }
        }

        System.out.println("Is " + number + " divisible by 5 and 6? " + result1);
        System.out.println("Is " + number + " divisible by 5 or 6? " + result2);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + result3);
    }
}
