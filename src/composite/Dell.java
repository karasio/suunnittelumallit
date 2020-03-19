package composite;

public class Dell implements Factory {

    public Dell() {
    }

    @Override
    public Case createCase() {
        return new Case(199.90);
    }

    @Override
    public Gpu createGpu() {
        return new Gpu(329.90);
    }

    @Override
    public MemoryChip createMemoryChip() {
        return new MemoryChip(74.95);
    }

    @Override
    public Motherboard createMotherboard() {
        return new Motherboard(212.60);
    }

    @Override
    public NetworkAdapter createNetworkAdapter() {
        return new NetworkAdapter(48.90);
    }

    @Override
    public Processor createProcessor() {
        return new Processor(325.90);
    }
}