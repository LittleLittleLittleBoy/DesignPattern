package Impl;

import Interface.Shape;

/**
 * Shape 接口的抽象装饰类。
 * Created by 李伟民 on 17/7/18.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
