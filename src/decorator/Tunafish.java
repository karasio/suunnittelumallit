package decorator;

import java.util.*;

public class Tunafish extends Topping {

    public Tunafish(Pizza p) {
        super(p);
    }

    public double getPrice() {
        return super.getPrice() + 2.10;
    }

    public String getDescription() {
        return super.getDescription() + ", albacore tuna fish";
    }

}