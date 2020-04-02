package strategy;

public class QuickSort extends Strategy {
    private int counter;
    private long start, end;
    @Override
    public int[] useAlgorithm(int[] data) {
        start = System.currentTimeMillis();
        quickSort(data, 0, data.length - 1);
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

    public void quickSort(int table[], int lo0, int hi0) {
        int lo = lo0;
        int hi = hi0;
        int mid, swap;

        mid = table[(lo0 + hi0) / 2];
        counter++;
        while (lo <= hi) {
            counter++;
            while (table[lo] < mid) {
                ++lo;
                counter++;
            }

            counter++;
            while (table[hi] > mid) {
                --hi;
                counter++;
            }

            counter++;
            if (lo <= hi) {
                swap = table[lo];
                table[lo] = table[hi];
                ++lo;
                table[hi] = swap;
                --hi;
            }
            counter++;
        }

        counter++;
        if (lo0 < hi) {
            quickSort(table, lo0, hi);
        }
        counter++;
        if (lo < hi0) {
            quickSort(table, lo, hi0);
        }
    }
}
