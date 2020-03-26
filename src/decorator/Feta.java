package decorator;

public class Feta extends Topping {

    public Feta(Pizza p) {
        super(p);
    }

    public double getPrice() {
        return super.getPrice() + 1.35;
    }

    public String getDescription() {
        return super.getDescription() + ", Greek feta cheese";
    }

}