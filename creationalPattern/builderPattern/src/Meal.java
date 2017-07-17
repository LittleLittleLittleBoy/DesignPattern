import Interface.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Item 对象的集合类。
 * Created by 李伟民 on 17/7/17.
 */
public class Meal {
    private List<Item> items=new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
