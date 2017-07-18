package Impl;

import Interface.Shape;

/**
 * shape的实现类
 * Created by 李伟民 on 17/7/18.
 */
public class Rectangle implements Shape {

    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}