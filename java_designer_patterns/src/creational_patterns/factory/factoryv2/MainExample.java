package creational_patterns.factory.factoryv2;

public class MainExample {

    public static void main(String[] args) {

        Creator creator = new ConcreteCreatorA();
        creator.doSomething();
    }
}
