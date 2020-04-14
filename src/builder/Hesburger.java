package builder;

// ConcreteBuilder1
public class Hesburger extends Builder {
    StringBuilder burger = new StringBuilder();

    @Override
    public void buildBuns() {
        burger.append("three soft buns, ");
    }

    @Override
    public void buildPatty() {
        burger.append("two all-beef patties, ");
    }

    @Override
    public void buildCheese() {
        burger.append("cheddar cheese, ");
    }

    @Override
    public void buildOnions() {
        burger.append("onion, ");
    }

    @Override
    public void buildPickles() {
        burger.append("pickles, ");
    }

    @Override
    public void buildSalad() {
        burger.append("iceberg lettuce, ");
    }

    @Override
    public void buildMayonnaise() {
        burger.append("Hesburger's own paprika and cucumber mayonnaise, ");
    }

    @Override
    public Object getBurger() {
        String first = Character.toString(burger.charAt(0)).toUpperCase();
        int last = burger.length();
        burger.replace(0, 1, first).replace(last-2, last, "");
        return burger;
    }
}
