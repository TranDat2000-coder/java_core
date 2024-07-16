package creational_patterns.factory.factory_method;

public class ShapeDesigner{
    static class Circle implements Shape{
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }

    static class Square implements Shape{
        @Override
        public void draw() {
            System.out.println("Drawing a Square");
        }
    }

    static class Rectangle implements Shape{
        @Override
        public void draw() {
            System.out.println("Drawing a rectangle");
        }
    }
}
