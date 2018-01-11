package Chapter6;

import java.util.Scanner;

/**
 * Checks to see if password has correct format
 *
 * @author LoganApples
 */
public class C6_18
{

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String password;

        System.out.println("Your password must have at least 8 characters.");
        System.out.println("Your password must consist only of letters and digits.");
        System.out.println("Your password must contain at least 2 digits.");

        System.out.println("Enter your password >>> ");
        password = input.next();

        password(password);
    }

    /**
     * Password Method
     *
     * @param password input string from main method
     */
    public static void password(String password)
    {
        String pattern = "^(?=.*?\\\\d.*\\\\d)[a-zA-Z0-9]{8,}$";
        if (password.matches(pattern) && password.length() >= 8)
        {
            System.out.println("Valid Password");
        } else
        {
            System.out.println("Invalid Password");
        }
    }
}
