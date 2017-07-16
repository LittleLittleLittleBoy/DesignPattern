package factory;

import Interface.Color;
import Interface.Shape;
import util.ColorEnum;
import util.ShapeEnum;

/**
 * 抽象工厂基类
 * Created by 李伟民 on 17/7/16.
 */
public abstract class AbstractFactory {
    public abstract Color getColor(ColorEnum colorEnum);
    public abstract Shape getShape(ShapeEnum shapeEnum);
}
