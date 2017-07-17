import Interface.Shape;

import static org.junit.Assert.*;

/**
 * Created by 李伟民 on 17/7/17.
 */
public class ShapeCacheTest {
    @org.junit.Test
    public void getShape() throws Exception {
        ShapeCache.loadCache();

        Shape cloneShape=ShapeCache.getShape("1");
        System.out.println("Shape : " + cloneShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }

}