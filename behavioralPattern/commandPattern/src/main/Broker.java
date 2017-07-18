package main;

import Interface.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 * Created by 李伟民 on 17/7/18.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
