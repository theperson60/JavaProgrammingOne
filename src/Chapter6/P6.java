package Chapter6;

import java.util.Scanner;

/**
 * Converts currencies into others
 *
 * @author LoganApples
 */
public class P6
{

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        double usdToEUR;
        double usdToGBP;
        double usdToJPY;
        double dollarAmount;
        String currency;
        double e;
        double p;
        double y;
        String response;

        System.out.print("How many Euros is one dollar worth? >>> ");
        usdToEUR = input.nextDouble();
        System.out.print("How many Pounds is one dollar worth? >>> ");
        usdToGBP = input.nextDouble();
        System.out.println("How many Yen is one dollar worth? >>> ");
        usdToJPY = input.nextDouble();

        System.out.println("One US Dollar can buy " + usdToEUR + " Euros.");
        System.out.println("One US Dollar can buy " + usdToGBP + " Pounds.");
        System.out.println("One US Dollar can buy " + usdToJPY + " Yen.");

        do
        {
            System.out.print("Enter an amount of dollars >>> ");
            dollarAmount = Integer.parseInt(input.next());
            System.out.print("Enter E to buy Euros, P to buy Pounds, or Y to buy Yen >>> ");
            currency = input.next();

            if ("E".equals(currency))
            {
                e = convert(dollarAmount, usdToEUR);
                System.out.println(e);
            }
            if ("P".equals(currency))
            {
                p = convert(dollarAmount, usdToGBP);
                System.out.println(p);
            }
            if ("Y".equals(currency))
            {
                y = convert(dollarAmount, usdToJPY);
                System.out.println(y);
            } else
            {
                System.out.println("You must enter one of the approved characters.");
            }

            System.out.print("Would you like to keep converting? Enter 'yes' or 'no' >>> ");
            response = input.next();

            if ("no".equals(response))
            {
                break;
            }
            if ("yes".equals(response))
            {
            } else
            {
                System.out.println("You must enter either 'yes' or 'no'");
            }
        } while ("yes".equals(response));
    }

    /**
     * Convert Method
     *
     * @param money amount of money
     * @param currency conversion rate for chosen currency
     * @return total of new currency
     */
    public static double convert(double money, double currency)
    {
        double total;
        if (money > 100)
        {
            total = money * .95 * currency;
        } else
        {
            total = money * .90 * currency;
        }
        return total;
    }
}
