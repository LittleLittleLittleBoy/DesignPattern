package Impl;

import Interface.Order;
import main.Stock;

/**
 * Order的实体类
 * Created by 李伟民 on 17/7/18.
 */
public class SellStock implements Order{
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
