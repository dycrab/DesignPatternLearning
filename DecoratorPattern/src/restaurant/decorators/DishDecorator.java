package restaurant.decorators;

import restaurant.dishes.Dish;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-04-03
 */
public abstract class DishDecorator extends Dish {

    public abstract String getDesc();
}
