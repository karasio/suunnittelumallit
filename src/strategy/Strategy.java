package strategy;

public abstract class Strategy {
    public abstract int[] useAlgorithm(int[] data);
    public abstract long getCounter();
    public abstract long getTime();
}
