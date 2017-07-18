import Impl.Circle;
import Impl.Rectangle;
import Impl.Square;
import Interface.Shape;

/**
 * 外观类
 * Created by 李伟民 on 17/7/18.
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}