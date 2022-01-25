import java.util.Scanner;

public class Lab3_Q1_Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter the loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        input.close();

        Loan loan = new Loan(annualInterestRate,loanAmount,numberOfYears);

        System.out.println("The loan was created on " + loan.getLoanDate());

        System.out.println("The monthly payment is " + String.format("%.2f", loan.getMonthlyPayment()));

        System.out.println("The total payment is " + String.format("%.2f", loan.getTotalPayment()));
    }
}