package strategy;

public class BubbleSort extends Strategy {
    private int counter = 0;
    private long start, end;
    @Override
    public int[] useAlgorithm(int[] data) {
        start = System.currentTimeMillis();
        int n = data.length;
        int k;
        counter++;
        for (int m = n; m >= 0; m--) {
            counter++;
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                counter++;
                if (data[i] > data[k]) {
                    swapNumbers(i, k, data);
                }
                counter++;
            }
            counter++;
        }
        end = System.currentTimeMillis();
        return data;
    }

    @Override
    public long getCounter() {
        return counter;
    }

    @Override
    public long getTime() {
        return end-start;
    }

    private static void swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
