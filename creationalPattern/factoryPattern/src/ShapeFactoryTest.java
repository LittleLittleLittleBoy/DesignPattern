import Interface.Shape;
import util.ShapeEnum;

import static org.junit.Assert.*;

/**
 * Created by 李伟民 on 17/7/12.
 */
public class ShapeFactoryTest {
    @org.junit.Test
    public void getShape() throws Exception {
        ShapeFactory shapeFactory=new ShapeFactory();

        Shape shape1=shapeFactory.getShape(ShapeEnum.CIRCLE);
        shape1.draw();

        Shape shape2=shapeFactory.getShape(ShapeEnum.RECTANGLE);
        shape2.draw();

        Shape shape3=shapeFactory.getShape(ShapeEnum.SQUARE);
        shape3.draw();
    }

}