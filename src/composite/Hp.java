package composite;

public class Hp implements Factory {

    public Hp() {
    }

    @Override
    public IComponent createCase() { return new Case(160.40); }

    @Override
    public IComponent createGpu() {
        return new Gpu(499.90);
    }

    @Override
    public IComponent createMemoryChip() {
        return new MemoryChip(155.55);
    }

    @Override
    public IComponent createMotherboard() {
        return new Motherboard(229.30);
    }

    @Override
    public IComponent createNetworkAdapter() {
        return new NetworkAdapter(0);
    }

    @Override
    public IComponent createProcessor() {
        return new Processor(443.70);
    }
}