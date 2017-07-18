package Impl;

import Interface.Order;
import main.Stock;

/**
 * Order的实体类
 * Created by 李伟民 on 17/7/18.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
