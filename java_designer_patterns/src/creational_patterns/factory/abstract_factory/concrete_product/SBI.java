package creational_patterns.factory.abstract_factory.concrete_product;

import creational_patterns.factory.abstract_factory.Bank;

public class SBI implements Bank {

    private final String BName;

    public SBI(String bName) {
        BName = bName;
    }

    @Override
    public String getBankName() {
        return BName;
    }
}
