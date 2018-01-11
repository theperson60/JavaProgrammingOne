package Chapter5;

import java.util.Scanner;
/**
 * Reverses a string
 * @author LoganApples
 */
public class C5_46
{
    /**
    * Main Method
    * 
    * @param  args arguments from command line
    */
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String string;
        String reverse;
        
        System.out.print("Enter a string >>> ");
        string = input.next();
        
        reverse = new StringBuilder(string).reverse().toString();
        System.out.println(reverse);
    }
}
