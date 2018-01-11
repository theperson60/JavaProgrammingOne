package Chapter2;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Finds the gratuity on a subtotal. Prints the gratuity and total.
 *
 * @author Apples Logan
 */
public class C2_5
{

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter;
        formatter = NumberFormat.getCurrencyInstance();

        double subtotal;
        double gratuityRate;
        double gratuity;
        double total;

        System.out.print("Enter the subtotal >>> ");
        subtotal = input.nextDouble();
        System.out.print("Enter the gratuity rate >>> ");
        gratuityRate = input.nextDouble();

        gratuity = (gratuityRate / 100) * 10;
        total = subtotal + gratuity;

        System.out.println("The gratuity is " + formatter.format(gratuity) + " and the total is " + formatter.format(total));
    }
}
