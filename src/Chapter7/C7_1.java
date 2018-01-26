package Chapter7;

import java.util.*;

/**
 * Accepts scores and prints grades based on those scores
 * 
 * @author Logan Apples
 */

public class C7_1
{
    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int total;
        double max;
        System.out.print("How many scores do you have to enter? >>> ");
        total = input.nextInt();
        
        double[] scores = new double[total];
        System.out.println("Enter your scores :");
        for(int i = 0; i < total; i++)
        {
            scores[i] = input.nextInt();
        }
        max = scores[0];
        for(int i = 0; i < total; i++)
        {
            if(max < scores[i])
            {
                max = scores[i];
            }
        }
        for(int i = 0; i < scores.length; i++)
        {
            grade(scores[i], max, i);
        }
    }
    
    /**
     * Grade method
     * 
     * @param score score from the array
     * @param max max value
     * @param i value in the array
     */
    
    public static void grade(double score, double max, int i)
    {
        if(score >= (max - 10))
        {
            System.out.println("Student " + i + "'s score is " + score + " and grade is A.");
        }
        if(score >= (max - 20) && score < (max - 10))
        {
            System.out.println("Student " + i + "'s score is " + score + " and grade is B.");
        }
        if(score >= (max - 30) && score < (max - 20))
        {
            System.out.println("Student " + i + "'s score is " + score + " and grade is C.");
        }
        if(score >= (max - 40) && score < (max - 30))
        {
            System.out.println("Student " + i + "'s score is " + score + " and grade is D.");
        }
        if(score < (max - 40))
        {
            System.out.println("Student " + i + "'s score is " + score + " and grade is F.");
        }
    }
}