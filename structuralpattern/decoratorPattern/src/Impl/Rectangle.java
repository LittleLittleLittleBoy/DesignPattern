package Impl;

import Interface.Shape;

/**
 * 接口的实体类
 * Created by 李伟民 on 17/7/18.
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
