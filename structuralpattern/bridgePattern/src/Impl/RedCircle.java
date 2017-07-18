package Impl;

import Interface.DrawAPI;

/**
 * DrawAPI 接口的实体桥接实现类。
 * Created by 李伟民 on 17/7/18.
 */
public class RedCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}