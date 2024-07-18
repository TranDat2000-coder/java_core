package creational_patterns.factory.abstract_factory.concrete_factory;

import creational_patterns.factory.abstract_factory.Bank;
import creational_patterns.factory.abstract_factory.Loan;
import creational_patterns.factory.abstract_factory.abstract_factory.AbstractFactory;
import creational_patterns.factory.abstract_factory.concrete_product.HDFC;
import creational_patterns.factory.abstract_factory.concrete_product.ICICI;
import creational_patterns.factory.abstract_factory.concrete_product.SBI;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        if (bank == null) {
            return null;
        }
        if (bank.equalsIgnoreCase("HDFC")) {
            return new HDFC(bank);
        } else if (bank.equalsIgnoreCase("ICICI")) {
            return new ICICI(bank);
        } else if (bank.equalsIgnoreCase("SBI")) {
            return new SBI(bank);
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
