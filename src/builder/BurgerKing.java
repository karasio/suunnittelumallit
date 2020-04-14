package builder;

import java.util.HashSet;
import java.util.Set;

public class BurgerKing extends Builder{
    Set<String> burger = new HashSet<>();

    @Override
    public void buildBuns() {
        burger.add("toasted sesame bun");
    }

    @Override
    public void buildPatty() {
        burger.add("more than 3/4 lb of savory flame-grilled 100% beef");
    }

    @Override
    public void buildCheese() {
        burger.add("melted American cheese");
    }

    @Override
    public void buildBacon() {
        burger.add("smoky bacon");
    }

    @Override
    public void buildMayonnaise() {
        burger.add("our special Stacker sauce");
    }

    @Override
    public Object getBurger() {
        return burger;
    }
}
