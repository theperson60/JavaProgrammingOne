package Chapter2;

import java.util.Scanner;
/**
 * Finds the volume and area of a cylinder
 * @author Apples Logan 
 */
public class C2_2
{
    /**
    * Main Method
    * 
    * @param  args arguments from command line
    */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double radius;
        double length;
        double area;
        double volume;
        
        System.out.print("Enter the radius of your cylinder >>> ");
        radius = input.nextDouble();
        System.out.print("Enter the length of your cylinder >>> ");
        length = input.nextDouble();
        
        area = radius * radius * Math.PI;
        volume = area * length;
        
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }    
}

