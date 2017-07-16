import factory.AbstractFactory;
import factory.ColorFactory;
import factory.ShapeFactory;
import util.FactoryEnum;

/**
 * 具体工厂提供的接口
 * Created by 李伟民 on 17/7/16.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryEnum factoryEnum){
        switch (factoryEnum){
            case Color:
                return new ColorFactory();
            case Shape:
                return new ShapeFactory();
            default:
                return null;
        }
    }
}
