package composite;

public class FactoryBuilder {
    private double totalPrice;
    private Factory f;

    public FactoryBuilder(Factory f) {
        this.f = f;
        create();
    }

    public void changeFactory(Factory f) {
        this.f = f;
        create();
    }

    public void create() {
        IComponent gpu = f.createGpu();
        IComponent ram = f.createMemoryChip();
        IComponent nwAdapter = f.createNetworkAdapter();
        IComponent processor = f.createProcessor();

        IComponent mother = f.createMotherboard();
        mother.addComponent(gpu);
        mother.addComponent(ram);
        mother.addComponent(nwAdapter);
        mother.addComponent(processor);

        IComponent computerCase = f.createCase();
        computerCase.addComponent(mother);
        totalPrice = computerCase.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
