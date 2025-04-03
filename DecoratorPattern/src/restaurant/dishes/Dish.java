package restaurant.dishes;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-03-31
 */
public abstract class Dish {

    String desc = "unknown dish";

    public String getDesc() {
        return this.desc;
    }

    public abstract double cost();
}
