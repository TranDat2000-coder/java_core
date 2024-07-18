package creational_patterns.factory.abstract_factory.abstract_factory;

import creational_patterns.factory.abstract_factory.Bank;
import creational_patterns.factory.abstract_factory.Loan;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);

    public abstract Loan getLoan(String loan);
}
