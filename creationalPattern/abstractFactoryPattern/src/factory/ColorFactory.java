package factory;

import Impl.color.Blue;
import Impl.color.Green;
import Impl.color.Red;
import Interface.Color;
import Interface.Shape;
import util.ColorEnum;
import util.ShapeEnum;

/**
 * 抽象工厂的具体工厂类
 * Created by 李伟民 on 17/7/16.
 */
public class ColorFactory extends AbstractFactory {
    public Color getColor(ColorEnum colorEnum) {
        switch (colorEnum){
            case Red:
                return new Red();
            case Blue:
                return new Blue();
            case Green:
                return new Green();
            default:
                return null;
        }
    }

    public Shape getShape(ShapeEnum shapeEnum) {
        return null;
    }
}
