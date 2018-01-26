package Chapter7;

import java.util.Scanner;
/**
 * Creates an array of a specified size and allows the user to fill it. Then prints the average.
 * 
 * @author Logan Apples
 */
public class P7
{
    /**
     * Main Method
     * 
     * @param args arguments from command line
     */
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double avg;
        
        System.out.print("How big should the array be? >>> ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("An array of size: " + size + " has been created.");
        
        fill(array);

        avg = average(array);
        
        print(avg);
    }
    
    /**
     * Fill method
     * Allows user to input values into different positions in the array
     * 
     * @param array array created in Main
     */
    public static void fill(int[] array)
    {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Enter a value for position " + i);
            array[i] = input.nextInt();
        }
    }
    
    /**
     * Average Method
     * Finds the average of the values in the array
     * 
     * @param array array from main method
     * @return return average value of the array
     */
    
    public static double average(int[] array)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        double avg = sum / (array.length);
        return avg;
    }
    
    /**
     * Print Method
     * Prints a double
     * 
     * @param avg average value of the array 
     */
    public static void print(double avg)
    {
        System.out.println(avg);
    }
}
