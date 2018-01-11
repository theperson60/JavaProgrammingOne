package Chapter4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Compares two bids and finds the better deal
 *
 * @author Apples Logan
 */
public class P4
{

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getInstance();

        String firstBidder;
        int firstBidderHours;
        double firstBidderPrice;
        double firstBidderTotal;
        String secondBidder;
        int secondBidderHours;
        double secondBidderPrice;
        double secondBidderTotal;

        System.out.print("What is the first bidder's name? >>> ");
        firstBidder = input.nextLine();

        System.out.print("How many hours will the first bidder require? >>> ");
        firstBidderHours = input.nextInt();

        System.out.print("How much does the first bidder charge per hour? >>> ");
        firstBidderPrice = input.nextDouble();

        System.out.print("What is the second bidder's name? >>> ");
        secondBidder = input.next();

        System.out.print("How many hours will the second bidder require? >>> ");
        secondBidderHours = input.nextInt();

        System.out.print("How much will the second bidder charge per hour? >>> ");
        secondBidderPrice = input.nextDouble();

        firstBidderTotal = firstBidderHours * firstBidderPrice;
        System.out.println("The total cost of the first bidder is " + firstBidderTotal);

        secondBidderTotal = secondBidderHours * secondBidderPrice;
        System.out.println("The total cost of the first bidder is " + secondBidderTotal);

        if (firstBidderTotal < secondBidderTotal)
        {
            System.out.println("The winner is " + firstBidder + ". The total cost will be " + formatter.format(firstBidderTotal));
        } else
        {
            if (secondBidderTotal < firstBidderTotal)
            {
                System.out.println("The winner is " + secondBidder + ". The total cost will be " + formatter.format(secondBidderTotal));
            } else
            {
                if (firstBidderTotal == secondBidderTotal && firstBidderHours < secondBidderHours)
                {
                    System.out.println("The winner is " + firstBidder + ". The total cost will be " + formatter.format(firstBidderTotal) + ". And the amount of time it will take is " + firstBidderHours + " hours.");
                } else
                {
                    if (firstBidderTotal == secondBidderTotal && secondBidderHours < firstBidderHours)
                    {
                        System.out.println("The winner is " + secondBidder + ". The total cost will be " + formatter.format(secondBidderTotal) + ". And the amount of time it will take is " + secondBidderHours + " hours.");
                    } else
                    {
                        if (firstBidderTotal == secondBidderTotal && firstBidderHours == secondBidderHours)
                        {
                            System.out.println(firstBidder + " and " + secondBidder + " have identical bids. Their estimated time to complete is " + firstBidderHours + ". Their cost per hour is " + formatter.format(firstBidderPrice) + ". The total estimated cost will be " + formatter.format(firstBidderTotal) + ".");
                        }
                    }
                }
            }
        }
    }
}
