package Impl.item.sub;

import Impl.item.Burger;

/**
 * Burger的实体类
 * Created by 李伟民 on 17/7/17.
 */
public class ChickenBurger extends Burger {
    public String name() {
        return "Chicken Burger";
    }

    public float price() {
        return 50.5f;
    }
}
