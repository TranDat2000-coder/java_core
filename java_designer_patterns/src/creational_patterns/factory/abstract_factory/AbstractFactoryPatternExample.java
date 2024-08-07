package creational_patterns.factory.abstract_factory;

import creational_patterns.factory.abstract_factory.abstract_factory.AbstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.javatpoint.com/abstract-factory-pattern

public class AbstractFactoryPatternExample {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String bankName = br.readLine();

        System.out.print("\n Enter the type of loan e.g. home loan or business loan or education loan : ");
        String loanName = br.readLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank(bankName);

        System.out.print("\n Enter the interest rate for " + bank.getBankName().toUpperCase() + ": ");
        double rate = Double.parseDouble(br.readLine());

        System.out.print("\n Enter the loan amount you want to take: ");
        double loanAmount = Double.parseDouble(br.readLine());

        System.out.print("\n Enter the number of years to pay your entire loan amount: ");
        int years = Integer.parseInt(br.readLine());

        System.out.println("\n you are taking the loan from " + bank.getBankName().toUpperCase());
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan(loanName);
        loan.getInterestRate(rate);
        loan.calculatePaymentLoan(loanAmount, years);
    }
}
