package composite;

public class CustomBuilder {

    private double totalPrice;

    public CustomBuilder() {
        Factory d = new Dell();
        IComponent gpu = d.createGpu();
        IComponent ram = d.createMemoryChip();
        Factory h = new Hp();
        IComponent nwAdapter = h.createNetworkAdapter();
        IComponent processor = d.createProcessor();

        IComponent mother = h.createMotherboard();
        mother.addComponent(gpu);
        mother.addComponent(ram);
        mother.addComponent(nwAdapter);
        mother.addComponent(processor);

        IComponent computerCase = d.createCase();
        computerCase.addComponent(mother);
        totalPrice = computerCase.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
