package builder;
// Director
public class Wolt {
    Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructBurger() {
        builder.buildBuns();
        builder.buildPatty();
        builder.buildSalad();
        builder.buildMayonnaise();
        builder.buildCheese();
        builder.buildPickles();
        builder.buildOnions();
        builder.buildBacon();
    }

    public Object getBurger() {
        System.out.println("Your order is moving to transport");
        return builder.getBurger();
    }
}
