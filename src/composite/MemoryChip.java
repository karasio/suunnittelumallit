package composite;

public class MemoryChip implements IComponent {
    private double price;

    public MemoryChip(double price) {
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