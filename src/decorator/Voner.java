package decorator;

public class Voner extends Topping {

    public Voner(Pizza p) {
        super(p);
    }

    public double getPrice() {
        return super.getPrice() + 2.50;
    }

    public String getDescription() {
        return super.getDescription() + ", vöner (vegan kebab)";
    }

}