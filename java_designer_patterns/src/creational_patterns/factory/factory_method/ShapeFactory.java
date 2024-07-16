package creational_patterns.factory.factory_method;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equals("CIRCLE")){
            return new ShapeDesigner.Circle();
        }else if(shapeType.equals("SQUARE")){
            return new ShapeDesigner.Square();
        }else if(shapeType.equals("RECTANGLE")){
            return new ShapeDesigner.Rectangle();
        }
        return null;
    }
}
