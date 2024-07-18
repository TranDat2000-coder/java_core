package creational_patterns.factory.abstract_factory.concrete_product;

import creational_patterns.factory.abstract_factory.Loan;

public class BussinessLoan extends Loan {
    @Override
    protected void getInterestRate(double r) {
        rate = r;
    }
}
