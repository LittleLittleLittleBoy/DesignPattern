package Impl.item;

import Impl.packing.Wrapper;
import Interface.Item;
import Interface.Packing;

/**
 * Item的实现类
 * Created by 李伟民 on 17/7/17.
 */
public abstract class Burger  implements Item {
    public Packing packing(){
        return new Wrapper();
    }
    public abstract float price();
}
