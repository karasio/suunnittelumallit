package decorator;

import java.util.*;

public class Olive extends Topping {

    public Olive(Pizza p) {
        super(p);
    }

    public double getPrice() {
        return super.getPrice() + 1.20;
    }

    public String getDescription() {
        return super.getDescription() + ", green and black olives";
    }

}