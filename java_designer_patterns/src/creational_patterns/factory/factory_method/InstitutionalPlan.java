package creational_patterns.factory.factory_method;

public class InstitutionalPlan extends Plan{
    @Override
    void getRate() {
        rate = 5.50;
    }
}
