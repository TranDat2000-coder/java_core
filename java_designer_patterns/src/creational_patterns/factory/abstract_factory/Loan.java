package creational_patterns.factory.abstract_factory;

public abstract class Loan {

    protected double rate;

    protected abstract void getInterestRate(double rate);

    public void calculatePaymentLoan(double loanAmount, int years) {

        int n = years * 12;
        rate = rate / 1200;
        double EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanAmount;
        System.out.println("your monthly EMI is " + EMI + " for the amount " + loanAmount + " you have borrowed");
    }
}
