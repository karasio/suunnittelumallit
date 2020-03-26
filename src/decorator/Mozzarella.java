package decorator;

import java.util.*;


public class Mozzarella extends Topping {

    public Mozzarella(Pizza p) {
        super(p);
    }

    public double getPrice() {
        return super.getPrice() + 1.85;
    }

    public String getDescription() {
        return super.getDescription() + ", mozzarella cheese";
    }

}