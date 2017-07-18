package main;

import Impl.BuyStock;
import Impl.SellStock;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 李伟民 on 17/7/18.
 */
public class BrokerTest {
    @Test
    public void test(){
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}