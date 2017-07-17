package Impl.item;

import Impl.packing.Bottle;
import Interface.Item;
import Interface.Packing;

/**
 * Item的抽象类
 * Created by 李伟民 on 17/7/17.
 */
public abstract class ColdDrink implements Item {


    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
