package decorator;

import java.util.*;

public class Base implements Pizza {

    public Base() {
    }

    public double getPrice() {
        return 2.20;
    }

    public String getDescription() {
        return "Basil & garlic flavored tomato sauce";
    }
}