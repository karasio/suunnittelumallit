package decorator;

import java.util.*;

public class Onion extends Topping {

    public Onion(Pizza p) {
        super(p);
    }

    public double getPrice() {
        return super.getPrice() + 0.80;
    }

    public String getDescription() {
        return super.getDescription() + ", red onion";
    }

}