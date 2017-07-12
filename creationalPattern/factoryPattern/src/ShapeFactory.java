import Impl.Circle;
import Impl.Rectangle;
import Impl.Square;
import Interface.Shape;
import util.ShapeEnum;

/**
 * Created by 李伟民 on 17/7/12.
 */
public class ShapeFactory {
    /**
     * 得到产品的方法
     * @param shapeEnum 产品类型
     * @return 产品实例
     */
    public Shape getShape(ShapeEnum shapeEnum){
        switch (shapeEnum){
            case CIRCLE: return new Circle();
            case SQUARE:return new Square();
            case RECTANGLE:return new Rectangle();
            default:return null;
        }
    }
}
