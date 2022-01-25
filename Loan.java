import java.util.Date;

public class Loan {

    private double annualInterestRate,loanAmount;
    private int numberOfYears;
    private Date loanDate;

    public Loan() {
        this.annualInterestRate = 2.5;
        this.loanAmount = 1000;
        this.numberOfYears = 1;
        this.loanDate = new Date();
    }

    public Loan(double annualInterestRate, double loanAmount, int numberOfYears) {
        this.annualInterestRate = annualInterestRate;
        this.loanAmount = loanAmount;
        this.numberOfYears = numberOfYears;
    }

    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }

    public int getNumberOfyears(){
        return this.numberOfYears;
    }

    public double getLoanAmount(){
        return this.loanAmount;
    }

    public Date getLoanDate(){
        Date loanDate = new Date();
        return loanDate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        double monthlyPayment = (this.loanAmount * this.annualInterestRate/100/12)/(1-(1/(Math.pow(1+this.annualInterestRate/100/12,this.numberOfYears*12))));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = (this.loanAmount * this.annualInterestRate/100/12)/(1-(1/(Math.pow(1+this.annualInterestRate/100/12,this.numberOfYears*12)))) * this.numberOfYears * 12;
        return totalPayment;
    }

}


