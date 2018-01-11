package Chapter3;

import java.util.Scanner;
/**
 * Decides the best deal for 2 packages based on weight and price
 * @author Apples Logan 
 */
public class C3_33
{
    /**
    * Main Method
    * 
    * @param  args arguments from command line
    */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double weight1;
        double price1;
        double weight2;
        double price2;
        
        System.out.print("Enter the weight of the first package >>> ");
        weight1 = input.nextDouble();
        System.out.print("Enter the price of the first package >>> ");
        price1 = input.nextDouble();
        System.out.print("Enter the weight of the second package >>> ");
        weight2 = input.nextDouble();
        System.out.print("Enter the price of the second package >>> ");
        price2 = input.nextDouble();
        
        if((weight1 / price1) > (weight2 / price2))
        {
            System.out.println("Package 1 has a better price.");
        }
        else if ((weight2 / price2) > (weight1 / price1))
        {
            System.out.println("Package 2 has a better price.");
        } 
        else
        {
            System.out.println("The packages are equal in price.");
        }
    }
}
