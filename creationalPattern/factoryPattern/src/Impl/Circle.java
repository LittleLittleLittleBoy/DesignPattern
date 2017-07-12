package Impl;

import Interface.Shape;

/**
 * 工厂产品的实现类
 * Created by 李伟民 on 17/7/12.
 */
public class Circle implements Shape{
    public void draw() {
        System.out.println("draw a circle");
    }
}
