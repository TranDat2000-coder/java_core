package creational_patterns.factory.factory_method;

/**
 * 1. Product interface or Abstract class
 */
abstract class Plan {

    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
