package creational_patterns.factory.factoryv2;

/// Factory (có thể là abstract class hoặc interface)
public abstract class Creator {

    /// Factory Method
    public abstract Product factoryMethod();

    /// Business logic (optional)
    public void doSomething() {
        Product product = factoryMethod();
        product.use();
    }
}
