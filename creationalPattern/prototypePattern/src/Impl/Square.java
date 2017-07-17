package Impl;

import Interface.Shape;

/**
 * 抽象类的实体类
 * Created by 李伟民 on 17/7/17.
 */
public class Square extends Shape {
    public Square(){
        type="Square";
    }
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
