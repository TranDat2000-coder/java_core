package creational_patterns.factory.factory_method;

/**
 * 2. Concrete product class
 */
public class CommercialPlan extends Plan{
    @Override
    void getRate() {
        rate = 7.50;
    }
}
