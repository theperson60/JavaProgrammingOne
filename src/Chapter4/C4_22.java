package Chapter4;

import java.util.Scanner;

/**
 * Compares two strings
 *
 * @author Apples Logan
 */
public class C4_22
{

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String firstString;
        String secondString;

        System.out.print("Enter words or other things >>> ");
        firstString = input.nextLine();
        System.out.print("Enter more words or other things >>> ");
        secondString = input.nextLine();

        if (firstString.contains(secondString) == true)
        {
            System.out.println("The first string contains the second.");
        } else
        {
            System.out.println("The first string does not contain the second.");
        }
    }
}
