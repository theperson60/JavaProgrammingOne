package Chapter7;

import java.util.*;

/**
 * Compares two arrays of integers input by the user
 * 
 * @author Logan Apples
 */

public class C7_26
{    
    /**
     * Main Method
     * 
     * @param args arguments from command line
     */
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        
        System.out.println("Enter 5 integers for array 1 >>> ");
        for(int i = 0; i < array1.length; i++)
        {
            array1[i] = input.nextInt();
        }
        System.out.println("Enter 5 integers for array 2 >>> ");
        for(int i = 0; i < array2.length; i++)
        {
            array2[i] = input.nextInt();
        }
        
        if(equals(array1, array2) == true)
        {
            System.out.println("Array 1 and Array 2 are strictly identical.");
        }
        else 
            System.out.println("The two arrays are not identical.");
            
        
    }
    
    /**
     * Checks to see if the arrays are the same
     * @param list1 first array
     * @param list2 second array
     * @return return true if the lists are exactly the same
     */
    public static boolean equals(int[] list1, int[] list2)
    {
        if(list1.length == list2.length)
        {
            for(int i = 0; i < list1.length; i++)
            {
                if(list1[i] != list2[i]) 
                    return false;
            }
        }
    return true;
    }   
}
