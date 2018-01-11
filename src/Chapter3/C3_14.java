package Chapter3;

import java.util.Scanner;
import java.util.Random;

/**
 * Guesses between heads and tails
 * @author Apples Logan
 */
public class C3_14
{
    /**
    * Main Method
    * 
    * @param  args arguments from command line
    */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int response;
        int x = (int)(Math.random() * 2);
        
        System.out.println("Press 0 for heads or 1 for tails");
        response = input.nextInt();
        System.out.println(x);
        
        if(response == x)
        {
            System.out.println("You guessed correctly!");
        }
        else if(response != x)
        {
            System.out.println("You guessed incorrectly");
        }
    }   
}
