package Chapter8;

/**
 * Calculates total hours for multiple employees and displays them in numerical order
 * 
 * @author Logan Apples
 */
public class C8_4
{
    static final int employees = 0;
    static final int hours = 1;
    
    /**
     * Main Method
     * 
     * @param args arguments from command line
     */
    
    public static void main(String[] args)
    {
        int[][] employeeHours = new int[][] 
        {{2, 4, 3, 4, 5, 8, 8},
        {7, 3, 4, 3, 3, 4, 4},
        {3, 3, 4, 3, 3, 2, 2},
        {9, 3, 4, 7, 3, 4, 1},
        {3, 5, 4, 3, 6, 3, 8},
        {3, 4, 4, 6, 3, 4, 4},
        {3, 7, 4, 8, 3, 8, 4},
        {6, 3, 5, 9, 2, 7, 9}};


        int[][] hoursChart = calculateTotalHours(employeeHours);

        sort(hoursChart);
        
        for(int x = 0; x < employeeHours.length; ++x)
        {
            for(int y = 0; y < employeeHours[x].length; ++y)
            {
                System.out.print(employeeHours[x][y] + " ");
            }
            System.out.println("");
        }

        for(int i = 0; i < hoursChart.length; i++)
        {
        System.out.println("Employee #"+ hoursChart[i][employees] + " total hours = " + hoursChart[i][hours]);
        }
    }

    /**
     * calculateToHours Method
     * Calculates the total hours for each row in the array
     * @param m array of hours and employees
     * @return new array
     */
    public static int[][] calculateTotalHours(int[][] m)
    {
        int[][] hoursChart = new int[m.length][2];

        for (int i = 0; i < m.length; i++) 
        {
            hoursChart[i][hours] = rowTotal(m, i);
            hoursChart[i][employees] = i;
        }
        return hoursChart;
    }
    
    /**
     * RowTotal Method
     * 
     * @param m array of hours
     * @param row total of rows
     * @return row total
     */

    public static int rowTotal(int[][] m, int row) 
    {
        int total = 0;
        for (int column = 0; column < m[row].length; column++) 
        {   
            total += m[row][column];
        }
        return total;
    }
    
    /**
     * Sort Method
     * Sorts the array into numerical order
     * 
     * @param m array of hours
     */
    public static void sort(int[][] m) 
    {
        for (int i = 0; i < m.length - 1; i++) 
        {
            int currentIndex = i;
            int currentMax = m[i][hours];
            int empNum = m[i][employees];
            for (int k = i + 1; k < m.length; k++) 
            {
                if (currentMax < m[k][hours]) 
                {
                    currentMax = m[k][hours];
                    currentIndex = k;
                    empNum = m[k][employees];
                }
            }
            if (currentIndex != i) 
            {
                m[currentIndex][employees] = m[i][employees];
                m[currentIndex][hours] = m[i][hours];
                m[i][employees] = empNum;
                m[i][hours] = currentMax;
            }

        }
    }
}
