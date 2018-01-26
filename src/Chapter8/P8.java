package Chapter8;

import java.util.Scanner;

/**
 * Accepts values for sales by salesman ID and day of the week, then totals all sales.
 * 
 * @author Logan Apples
 */
public class P8
{
    /**
     * Main Method
     * 
     * @param args arguments from command line
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int salesman = 0;
        int day = 0;
        String response;
        double sale;
        double[][] sales = new double[4][5];
        //Rows represent salesmen [4]
        //Columns represent days [5]
        boolean Continue = true;

        while(Continue)
        {
            System.out.print("Enter the salesman ID as A, B, C, or D >>> ");
            response = input.next();
            if(response.equalsIgnoreCase("A"))
                salesman = 0;
            else if(response.equalsIgnoreCase("B"))
                salesman = 1;
            else if(response.equalsIgnoreCase("C"))
                salesman = 2;
            else if(response.equalsIgnoreCase("D"))
               salesman = 3;
            else
                continue;
            
            System.out.print("Enter the day as M, T, W, H, or F >>> ");
            response = input.next();
            if(response.equalsIgnoreCase("M"))
                day = 0;
            else if(response.equalsIgnoreCase("T"))
                day = 1;
            else if(response.equalsIgnoreCase("W"))
                day = 2;
            else if(response.equalsIgnoreCase("H"))
                day = 3;
            else if(response.equalsIgnoreCase("F"))
                day = 4;
            else
                continue;
            
            System.out.print("Enter the amount of the sale >>> ");
            sale = input.nextDouble();
            
            sales[salesman][day] += sale;
            System.out.println("More data? Enter Y for more or N to stop >>> ");
            response = input.next();
            if(response.equalsIgnoreCase("Y"))
                Continue = true;
            else if(response.equalsIgnoreCase("N"))
                Continue = false;
        }
        double total = 0;
        for(int x = 0; x < sales.length; ++x)
        {
            for(int y = 0; y < sales[x].length; ++y)
            {
                System.out.print(sales[x][y] + " ");
                total += sales[x][y];
            }
            System.out.println("\n");
        }
        System.out.println("The total sales are " + total);
    }
}