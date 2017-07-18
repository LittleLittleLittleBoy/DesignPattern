package main;

import Interface.DrawAPI;

/**
 * 使用 DrawAPI 接口创建抽象类 Shape。
 * Created by 李伟民 on 17/7/18.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
