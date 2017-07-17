package Impl;

import Interface.Shape;

/**
 * 抽象类的实体类
 * Created by 李伟民 on 17/7/17.
 */
public class Circle extends Shape {
    public Circle(){
        type="Circle";
    }
    public void draw() {
        System.out.println("Inside Shape::draw() method.");
    }
}
