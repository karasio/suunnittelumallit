package decorator;

import java.util.*;

/**
 * 
 */
public class Chicken extends Topping {

    public Chicken(Pizza p) {
        super(p);
    }

    public double getPrice() {
        return super.getPrice() + 2.8;
    }

    public String getDescription() {
        return super.getDescription() + ", roasted chicken";
    }

}