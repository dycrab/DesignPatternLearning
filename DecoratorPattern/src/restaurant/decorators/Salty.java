package restaurant.decorators;

import restaurant.dishes.Dish;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-03-31
 */
public class Salty extends DishDecorator {

    Dish dish;

    public Salty(Dish dish) {
        this.dish = dish;
    }

    @Override
    public String getDesc() {
        return dish.getDesc()+", Salty";
    }

    @Override
    public double cost() {
        return dish.cost()+0.3;
    }
}
