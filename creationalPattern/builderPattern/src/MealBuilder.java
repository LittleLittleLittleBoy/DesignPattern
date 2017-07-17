import Impl.item.sub.ChickenBurger;
import Impl.item.sub.Coke;
import Impl.item.sub.Pepsi;
import Impl.item.sub.VegBurger;

/**
 * 负责创建Meal
 * Created by 李伟民 on 17/7/17.
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}