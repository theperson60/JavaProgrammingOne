package Chapter5;

import java.util.Scanner;

/**
 * Counts yes and no votes
 *
 * @author LoganApples
 */
public class P5
{

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String vote = "";
        int noVotes = 0;
        int yesVotes = 0;

        while (!"q".equals(vote) || !"Q".equals(vote))
        {
            System.out.println("Enter 'Y' or 'y' to vote yes. Enter 'N' or 'n' to vote no. Enter 'Q' or 'q' to quit voting.");
            vote = input.next();

            if ("Y".equals(vote) || "y".equals(vote))
            {
                yesVotes += 1;
            } else
            {
                if ("N".equals(vote) || "n".equals(vote))
                {
                    noVotes += 1;
                } else
                {
                    if ("Q".equals(vote) || "q".equals(vote))
                    {
                        break;
                    } else
                    {
                        if (!"Y".equals(vote) || !"y".equals(vote) || !"N".equals(vote) || !"n".equals(vote) || !"Q".equals(vote) || !"q".equals(vote))
                        {
                            System.out.println("You must enter one of the approved characters.");
                        }
                    }
                }
            }
        }

        System.out.println("There were " + yesVotes + " votes for yes.");
        System.out.println("There were " + noVotes + " votes for no.");
    }
}
