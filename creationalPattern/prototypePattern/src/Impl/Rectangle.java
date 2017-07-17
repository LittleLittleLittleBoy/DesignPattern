package Impl;

import Interface.Shape;

/**
 * 抽象类的实体类
 * Created by 李伟民 on 17/7/17.
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
