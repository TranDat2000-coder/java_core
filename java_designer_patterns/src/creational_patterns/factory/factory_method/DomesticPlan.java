package creational_patterns.factory.factory_method;

/**
 * 2. Concrete product class
 */
public class DomesticPlan extends Plan{

    @Override
    void getRate() {
        rate = 3.50;
    }
}
