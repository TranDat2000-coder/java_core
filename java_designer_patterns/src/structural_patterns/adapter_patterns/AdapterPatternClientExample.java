package structural_patterns.adapter_patterns;

public class AdapterPatternClientExample {
    public static void main(String[] args) {

        CreditCardTarget target = new BankCustomerAdapter();
        target.giveBankDetails();

        System.out.println(target.getCreditCard());
    }
}
