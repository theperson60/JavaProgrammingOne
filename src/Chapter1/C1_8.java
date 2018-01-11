package Chapter1;

/**
 * Finds the perimeter and area of a circle
 *
 * @author Apples Logan
 */
public class C1_8
{

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args)
    {
        double radius = 5.5;
        double perimeter = radius * 2 * Math.PI;
        double area = radius * radius * Math.PI;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
