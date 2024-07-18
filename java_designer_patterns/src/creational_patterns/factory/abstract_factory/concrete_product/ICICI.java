package creational_patterns.factory.abstract_factory.concrete_product;

import creational_patterns.factory.abstract_factory.Bank;

public class ICICI implements Bank {

    private final String BName;

    public ICICI(String bName) {
        BName = bName;
    }

    @Override
    public String getBankName() {
        return BName;
    }
}
