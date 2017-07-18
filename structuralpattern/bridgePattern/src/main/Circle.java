package main;

import Interface.DrawAPI;

/**
 * 创建实现了 Shape 接口的实体类。
 * Created by 李伟民 on 17/7/18.
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
