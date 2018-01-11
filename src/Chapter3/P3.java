package Chapter3;

import java.util.Scanner;

/**
 * Compares 2 numbers
 *
 * @author Apples Logan
 */
public class P3
{

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double numberOne;
        double numberTwo;

        System.out.print("Enter a number >>> ");
        numberOne = input.nextDouble();
        System.out.print("Enter another number >>> ");
        numberTwo = input.nextDouble();

        if (numberOne < numberTwo)
        {
            System.out.println("The first number is less than the second.");
        }

        if (numberOne > numberTwo)
        {
            System.out.println("The first number is greater than the second.");
        }

        if (numberOne == numberTwo)
        {
            System.out.println("The first number is equal to the second.");
        }

        if (numberOne <= numberTwo)
        {
            System.out.println("The first number is less than or equal to the second.");
        }

        if (numberOne != numberTwo)
        {
            System.out.println("The first number is not equal to the second.");
        }

        if (numberTwo == 0)
        {
            System.out.println("Cannot divide by 0.");
        } else
        {
            if (numberOne / numberTwo < 1)
            {
                System.out.println("Proper fraction.");
            } else
            {
                if (numberOne / numberTwo > 1)
                {
                    System.out.println("Improper fraction.");
                }
            }
        }

        if (numberOne >= 90)
        {
            System.out.println("A");
        } else
        {
            if (numberOne >= 80)
            {
                System.out.println("B");
            } else
            {
                if (numberOne >= 70)
                {
                    System.out.println("C");
                } else
                {
                    if (numberOne >= 60)
                    {
                        System.out.println("D");
                    } else
                    {
                        if (numberOne >= 50)
                        {
                            System.out.println("F");
                        }
                    }
                }
            }
        }

        if (numberTwo >= 1 && numberTwo <= 100)
        {
            System.out.println("In range.");
        } else
        {
            System.out.println("Out of range.");
        }
    }
}
