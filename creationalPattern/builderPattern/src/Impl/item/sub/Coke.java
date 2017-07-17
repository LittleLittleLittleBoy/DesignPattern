package Impl.item.sub;

import Impl.item.ColdDrink;

/**
 * ColdDrink的实体类
 * Created by 李伟民 on 17/7/17.
 */
public class Coke extends ColdDrink {
    public String name() {
        return "Coke";
    }

    public float price() {
        return 30.0f;
    }
}
