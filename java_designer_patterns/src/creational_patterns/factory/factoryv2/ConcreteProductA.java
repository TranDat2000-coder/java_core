package creational_patterns.factory.factoryv2;

public class ConcreteProductA implements Product{

    @Override
    public void use() {
        System.out.println("Using Product A");
    }
}
