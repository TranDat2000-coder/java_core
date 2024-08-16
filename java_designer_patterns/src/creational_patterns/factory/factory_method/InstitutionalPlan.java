package creational_patterns.factory.factory_method;

/**
 * 2. Concrete product class
 */
public class InstitutionalPlan extends Plan{
    @Override
    void getRate() {
        rate = 5.50;
    }
}
