package Chapter7;

import java.util.*;

/**
 * Allows a user to input 10 numbers into an array and then find the minimum value
 * 
 * @author Logan Apples
 */
public class C7_9
{
    /**
     * Main Method
     * 
     * @param args arguments from command line 
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        double min;
        
        System.out.println("Enter 10 numbers");
        for(int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }
        min = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(min > array[i])
            {
                min = array[i];
            }
        }
        System.out.println("The minimum number is: " + min);
    }
}