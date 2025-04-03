package restaurant.dishes;

/**
 * 土豆丝
 *
 * @author z30072591
 * @since 2025-03-31
 */
public class ShreddedPotatoes extends Dish {

    public ShreddedPotatoes() {
        desc = "ShreddedPotatoes";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
