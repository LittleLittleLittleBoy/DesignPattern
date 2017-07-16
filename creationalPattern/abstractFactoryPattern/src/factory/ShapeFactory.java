package factory;

import Impl.shape.Circle;
import Impl.shape.Rectangle;
import Impl.shape.Square;
import Interface.Color;
import Interface.Shape;
import util.ColorEnum;
import util.ShapeEnum;

/**
 * 抽象工厂的具体工厂类
 * Created by 李伟民 on 17/7/16.
 */
public class ShapeFactory extends AbstractFactory {

    public Color getColor(ColorEnum colorEnum) {
        return null;
    }

    public Shape getShape(ShapeEnum shapeEnum){
        switch (shapeEnum){
            case Circle:
                return new Circle();
            case Square:
                return new Square();
            case Rectangle:
                return new Rectangle();
            default:
                    return null;
        }
    }


}
