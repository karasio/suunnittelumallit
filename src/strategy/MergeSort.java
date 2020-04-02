package strategy;

public class MergeSort extends Strategy {
    private long counter;
    private int[] help;
    private int[] help2;
    long start;
    long end;

    @Override
    public int[] useAlgorithm(int[] originalData) {
        help = originalData;
        help2 = new int[originalData.length];
        start = System.currentTimeMillis();
        doMergeSort(0, originalData.length-1);
        end = System.currentTimeMillis();
        return originalData;
    }

    public long getCounter() {
        return counter;
    }

    public long getTime() {
        return end-start;
    }

    public void doMergeSort(int lo, int hi) {
        counter++;
        if (lo < hi) {
            int middle = lo + (hi-lo)/2;
            doMergeSort(lo, middle);
            doMergeSort(middle+1, hi);
            mergeParts(lo, middle, hi);
        }
    }

    private void mergeParts(int lo, int middle, int hi) {
        counter++;
        for (int i = lo; i <= hi; i++) {
            help2[i] = help[i];
            counter++;
        }

        int i = lo;
        int j = middle + 1;
        int k = lo;

        counter = counter+2;
        while (i <= middle && j <= hi) {
            counter++;
            if (help2[i] <= help2[j]) {
                help[k] = help2[i];
                i++;
            } else {
                help[k] = help2[j];
                j++;
            }
            k++;
            counter = counter + 2;
        }
        counter++;
        while (i <= middle) {
            help[k] = help2[i];
            k++;
            i++;
            counter++;
        }
    }
}
