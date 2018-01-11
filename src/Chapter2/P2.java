package Chapter2;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Finds the total cost of a meal based on the price of food, drink, sales tax,
 * and tip
 *
 * @author Apples Logan
 */
public class P2
{

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args)
    {
        double foodPrice;
        double drinkPrice;
        double salesTax;
        double totalTip;
        double totalCost;
        NumberFormat formatter;
        formatter = NumberFormat.getCurrencyInstance();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of your food >>> ");
        foodPrice = input.nextDouble();

        System.out.print("Enter the price of your drink >>> ");
        drinkPrice = input.nextDouble();

        salesTax = (foodPrice + drinkPrice) * .10;
        totalTip = (foodPrice + drinkPrice + salesTax) * .15;

        totalCost = foodPrice + drinkPrice + salesTax + totalTip;

        System.out.println("The price of your food was " + formatter.format(foodPrice) + ".");
        System.out.println("The price of your drink was " + formatter.format(drinkPrice) + ".");
        System.out.println("The tax on your meal was " + formatter.format(salesTax) + ".");
        System.out.println("You should tip your waitress " + formatter.format(totalTip) + ".");
        System.out.println("Your total is " + formatter.format(totalCost) + ".");
    }
}
