package creational_patterns.factory.factory_method;

public class CommercialPlan extends Plan{
    @Override
    void getRate() {
        rate = 7.50;
    }
}
