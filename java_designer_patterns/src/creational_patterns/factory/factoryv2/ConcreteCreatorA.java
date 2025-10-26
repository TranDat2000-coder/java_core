package creational_patterns.factory.factoryv2;

public class ConcreteCreatorA extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
