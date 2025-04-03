import restaurant.decorators.Salty;
import restaurant.decorators.Spicy;
import restaurant.dishes.ColdBeef;
import restaurant.dishes.Dish;
import restaurant.dishes.ShreddedPotatoes;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-03-31
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("#### add salty coldBeef ####");
        Dish coldBeef = new ColdBeef();
        coldBeef = new Salty(coldBeef);

        System.out.println(coldBeef.getDesc());
        System.out.println(coldBeef.cost());

        System.out.println("#### add spicy coldBeef ####");
        Dish coldBeef2 = new ColdBeef();
        coldBeef2 = new Spicy(coldBeef2);

        System.out.println(coldBeef2.getDesc());
        System.out.println(coldBeef2.cost());

        System.out.println("#### add spicy and salty ShreddedPotatoes ####");
        Dish shreddedPotatoes = new ShreddedPotatoes();
        shreddedPotatoes = new Salty(shreddedPotatoes);
        shreddedPotatoes = new Spicy(shreddedPotatoes);

        System.out.println(shreddedPotatoes.getDesc());
        System.out.println(shreddedPotatoes.cost());
    }
}