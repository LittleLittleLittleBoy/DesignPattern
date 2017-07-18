package main;

import Impl.GreenCircle;
import Impl.RedCircle;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 李伟民 on 17/7/18.
 */
public class ShapeTest {
    @Test
    public void test(){
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}