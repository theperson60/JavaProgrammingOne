package Chapter2;

import java.util.Scanner;

/**
 * Converts Celsius to Farenheit
 *
 * @author Apples Logan
 */
public class C2_1
{

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.print("Enter a temperature in Celsius >>> ");
        celsius = input.nextDouble();

        fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " degrees in Celsius is " + fahrenheit + " degrees in Fahrenheit");
    }
}
