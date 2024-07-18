package creational_patterns.factory.abstract_factory.concrete_factory;

import creational_patterns.factory.abstract_factory.Bank;
import creational_patterns.factory.abstract_factory.Loan;
import creational_patterns.factory.abstract_factory.abstract_factory.AbstractFactory;
import creational_patterns.factory.abstract_factory.concrete_product.BussinessLoan;
import creational_patterns.factory.abstract_factory.concrete_product.EducationLoan;
import creational_patterns.factory.abstract_factory.concrete_product.HomeLoan;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        }else if(loan.equalsIgnoreCase("Business")){
            return new BussinessLoan();
        }else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }
}
