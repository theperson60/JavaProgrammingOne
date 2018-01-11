package Chapter4;

import java.util.Scanner;
/**
 * Prints a major and grade based on input from the user
 * @author Apples Logan 
 */
public class C4_18
{
    /**
    * Main Method
    * 
    * @param  args arguments from command line
    */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        char major;
        char grade;
        
        System.out.print("Enter the character for your major >>> ");
        major = input.next().charAt(0);
        System.out.print("Enter the character for your grade >>> ");
        grade = input.next().charAt(0);
        
        if (major == 'M' || major == 'm')
        {
            if(grade == '1')
                System.out.println("Mathematics Freshman");
            else if (grade == '2')
                System.out.println("Mathematics Sophomore");
            else if (grade == '3')
                System.out.println("Mathematics Junior");
            else if (grade == '4')
                System.out.println("Mathematics Senior");
            else
                System.out.println("That grade doesn't exist.");
        }
        else if (major == 'C' || major == 'c')
        {
            if (grade == '1')
                System.out.println("Computer Science Freshman");
            if (grade == '2')
                System.out.println("Computer Science Sophomore");
            if (grade == '3')
                System.out.println("Computer Science Junior");
            if (grade == '4')
                System.out.println("Computer Science Senior");
            else
                System.out.println("That grade doesn't exist.");
        }
        else if (major == 'I' || major == 'i')
        {
            if (grade == '1')
                System.out.println("Information Technology Freshman");
            else if (grade == '2')
                System.out.println("Information Technology Sophomore");
            else if (grade == '3')
                System.out.println("Information Technology Junior");
            else if (grade == '4')
                System.out.println("Information Technology Senior");
            else 
                System.out.println("That grade doesn't exist.");
        }
        else if (major != 'M' || major != 'C' || major != 'I')
        {
            System.out.println("You must enter one of the approved majors."); 
        }
    }
}
