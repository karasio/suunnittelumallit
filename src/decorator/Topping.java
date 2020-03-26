package decorator;

public abstract class Topping implements Pizza {
    private final Pizza pizzaWithToppings;

//    public Topping() {}
    public Topping(Pizza p) {
        this.pizzaWithToppings = p;
    }

    @Override
    public double getPrice() {
        return pizzaWithToppings.getPrice();
    }

    @Override
    public String getDescription() {
        return pizzaWithToppings.getDescription();
    }
}