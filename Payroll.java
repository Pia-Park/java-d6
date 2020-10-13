import java.util.Scanner;
import java.lang.Math;

public class Payroll {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double numOfhour = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double fedTax = input.nextDouble();

        System.out.print("Enter state tax withholing rate: ");
        double stateTax = input.nextDouble();

        double grossPay = numOfhour * payRate;
        grossPay = Math.round(grossPay * 100)/100.0;
        double deFedTax = grossPay * fedTax;
        deFedTax = Math.round(deFedTax * 100)/100.0;
        double deStateTax = grossPay * stateTax;
        deStateTax = Math.round(deStateTax * 100)/100.0;
        double totalDeduction = deFedTax + deStateTax;
        totalDeduction = Math.floor(totalDeduction * 100)/100.0;
        double netPay = grossPay - totalDeduction;
        netPay = Math.round(netPay * 100)/100.0;

        String allInfo = "Employee Name: " + name + "\nHours Worked: " + numOfhour + "\nPay Rate: $" + payRate + "\nGross Pay: $" + grossPay;
        String deduction = "Deduction:\n\tFederal Withhoing(" + (fedTax * 100) + "%): $" + deFedTax + "\n\tState Withholding(" + (stateTax * 100) + "%): $" + deStateTax + "\n\tTotal Deduction: $" + totalDeduction + "\nNet Pay: $" + netPay;

        System.out.println(allInfo + "\n" + deduction);

    }
}
