package composite;

public interface Factory {

    IComponent createCase();
    IComponent createGpu();
    IComponent createMemoryChip();
    IComponent createMotherboard();
    IComponent createNetworkAdapter();
    IComponent createProcessor();

}