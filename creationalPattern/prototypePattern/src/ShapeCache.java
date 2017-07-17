import Impl.Circle;
import Impl.Rectangle;
import Impl.Square;
import Interface.Shape;

import java.util.Hashtable;

/**
 * 从数据库获取实体类，并把它们存储在一个 Hashtable 中。
 * Created by 李伟民 on 17/7/17.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap=new Hashtable<String, Shape>();

    public static Shape getShape(String shapeid){
        Shape cacheShape=shapeMap.get(shapeid);
        return (Shape) cacheShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
