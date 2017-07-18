package main;

/**
 * 请求类
 * Created by 李伟民 on 17/7/18.
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("main.Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("main.Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
    }
}
