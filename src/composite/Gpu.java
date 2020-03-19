package composite;

public class Gpu implements IComponent {

    private double price;

    public Gpu(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void addComponent(IComponent component) {
        throw new RuntimeException(
                "Cannot add component to simple component"
        );
    }

}