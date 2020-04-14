package builder;

import builder.mcingredients.*;
import java.util.ArrayList;
import java.util.List;

// ConcreteBuilder2
public class McDonalds extends Builder {
    List<Object> burger = new ArrayList<>();

    @Override
    public void buildBuns() {
        burger.add(new Bun("Big Mac bun"));
    }

    @Override
    public void buildPatty() {
        burger.add(new Patty("100% Beef patty"));
    }

    @Override
    public void buildSalad() {
        burger.add(new IcebergLettuce("Shredded lettuce"));
    }

    @Override
    public void buildMayonnaise() {
        burger.add(new Mayonnaise("Big Mac Sauce"));
    }

    @Override
    public void buildCheese() {
        burger.add(new Cheese("Pasteurized Process American Cheese"));
    }

    @Override
    public void buildPickles() {
        burger.add(new Pickles("Pickle Slices"));
    }

    @Override
    public void buildOnions() {
        burger.add("Onions");
    }

    @Override
    public Object getBurger() {
        return burger;
    }
}
