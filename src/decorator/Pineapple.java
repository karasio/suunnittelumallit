package decorator;

import java.util.*;

public class Pineapple extends Topping {

    public Pineapple(Pizza p) {
        super(p);
    }

    public double getPrice() {
        return super.getPrice() + 1.10;
    }

    public String getDescription() {
        return super.getDescription() + ", fresh pineapple";
    }

}