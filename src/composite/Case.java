package composite;

import java.util.ArrayList;
import java.util.List;

public class Case implements IComponent {

    private double price;
    private List<IComponent> components = new ArrayList<>();

    public Case(double price) {
        this.price = price;
    }

    public double getPrice() {
        double total = price;
        for (IComponent c : components) {
            total += c.getPrice();
        }
        return total;
    }

    @Override
    public void addComponent(IComponent component) {
        components.add(component);
    }


}