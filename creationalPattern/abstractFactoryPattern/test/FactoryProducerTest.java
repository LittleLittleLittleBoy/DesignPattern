import Interface.Color;
import Interface.Shape;
import factory.AbstractFactory;
import util.ColorEnum;
import util.FactoryEnum;
import util.ShapeEnum;

import static org.junit.Assert.*;

/**
 * Created by 李伟民 on 17/7/16.
 */
public class FactoryProducerTest {
    @org.junit.Test
    public void getFactory() throws Exception {
        //获取红色
        AbstractFactory abstractFactory1=FactoryProducer.getFactory(FactoryEnum.Color);

        Color color=abstractFactory1.getColor(ColorEnum.Red);

        color.fill();

        //获取圆形
        AbstractFactory abstractFactory2=FactoryProducer.getFactory(FactoryEnum.Shape);

        Shape shape=abstractFactory2.getShape(ShapeEnum.Circle);

        shape.draw();
    }

}