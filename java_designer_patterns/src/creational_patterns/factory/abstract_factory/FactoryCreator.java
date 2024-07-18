package creational_patterns.factory.abstract_factory;

import creational_patterns.factory.abstract_factory.abstract_factory.AbstractFactory;
import creational_patterns.factory.abstract_factory.concrete_factory.BankFactory;
import creational_patterns.factory.abstract_factory.concrete_factory.LoanFactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        }else if(choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }
        return null;
    }
}
