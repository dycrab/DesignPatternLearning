package restaurant.dishes;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-04-03
 */
public class ColdBeef extends Dish {

    public ColdBeef() {
        desc = "ColdBeef";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
