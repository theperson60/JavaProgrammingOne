package Chapter4;

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
/**
 * Prints pay information for employees
 * @author Apples Logan
 */
public class C4_23
{
    /**
    * Main Method
    * 
    * @param  args arguments from command line
    */
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        DecimalFormat df = new DecimalFormat("#.##");
        
        String employeeName;
        double hoursWorked;
        double payRate;
        double fedTax;
        double stateTax;
        double grossPay;
        double fedDeduction;
        double stateDeduction;
        double totalDeduction;
        double netPay;
        
        System.out.print("Enter employee's name >>> ");
        employeeName = input.nextLine();
        System.out.print("Enter number of hours worked in a week >>> ");
        hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate >>> ");
        payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate >>> ");
        fedTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate >>> ");
        stateTax = input.nextDouble();
        
        grossPay = payRate * hoursWorked;
        fedDeduction = grossPay * fedTax;
        stateDeduction = grossPay * stateTax;
        totalDeduction = fedDeduction + stateDeduction;
        netPay = grossPay - totalDeduction;
        
        double fedPercent = fedTax * 100;
        double statePercent = stateTax * 100;
        
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + df.format(hoursWorked));
        System.out.println("Hourly pay rate: " + formatter.format(payRate));
        System.out.println("Gross pay: " + formatter.format(grossPay));
        System.out.println("Deductions:\n   Federal withholding (" + df.format(fedPercent) + "%): " + formatter.format(fedDeduction) + "\n   State withholding (" + df.format(statePercent) + "%): " + formatter.format(stateDeduction) + "\n Total Deduction: " + formatter.format(totalDeduction));
        System.out.println("Net Pay: " + formatter.format(netPay));
    }
}

