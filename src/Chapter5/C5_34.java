package Chapter5;

import java.util.Scanner;
import java.util.Random;

/**
 * Plays rock paper scissors until either the player or computer has 2 more wins
 * than the other
 *
 * @author ApplesLogan
 */
public class C5_34
{

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String userChoice;
        int compChoice = rand.nextInt(3);
        int userWins = 0;
        int compWins = 0;
        boolean wins = true;

        while (wins == true)
        {
            System.out.print("Enter 'rock', 'paper', or 'scissors' >>> ");
            userChoice = input.next();

            compChoice = rand.nextInt(3);
            //0 is rock
            //1 is paper
            //2 is scissors

            if ("rock".equals(userChoice) && compChoice == 0)
            {
                System.out.println("It's a tie.");
            } else
            {
                if ("rock".equals(userChoice) && compChoice == 1)
                {
                    System.out.println("Player loses. Paper beats rock.");
                    compWins += 1;
                } else
                {
                    if ("rock".equals(userChoice) && compChoice == 2)
                    {
                        System.out.println("Player wins. Rock beats scissors.");
                        userWins += 1;
                    } else
                    {
                        if ("paper".equals(userChoice) && compChoice == 0)
                        {
                            System.out.println("Player wins. Paper beats rock.");
                            userWins += 1;
                        } else
                        {
                            if ("paper".equals(userChoice) && compChoice == 1)
                            {
                                System.out.println("It's a tie.");
                            } else
                            {
                                if ("paper".equals(userChoice) && compChoice == 2)
                                {
                                    System.out.println("Player loses. Scissors beats paper.");
                                    compWins += 1;
                                } else
                                {
                                    if ("scissors".equals(userChoice) && compChoice == 0)
                                    {
                                        System.out.println("Player loses. Rock beats scissors.");
                                        compWins += 1;
                                    } else
                                    {
                                        if ("scissors".equals(userChoice) && compChoice == 1)
                                        {
                                            System.out.println("Player wins. Scissors beats paper.");
                                            userWins += 1;
                                        } else
                                        {
                                            if ("scissors".equals(userChoice) && compChoice == 2)
                                            {
                                                System.out.println("It's a tie.");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (userWins > (compWins + 1) || compWins > (userWins + 1))
            {
                wins = false;
            }
        }
    }
}
