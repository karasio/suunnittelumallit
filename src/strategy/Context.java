package strategy;

import java.text.DecimalFormat;

public class Context {
    Strategy strategy;
    public void chooseStrategy(String s, int[] data) {
        switch (s) {
            case "merge":
                strategy = new MergeSort();
                break;
            case "bubble":
                strategy = new BubbleSort();
                break;
            case "quick":
                strategy = new QuickSort();
        }
//        printNumbers(strategy.useAlgorithm(data));
        strategy.useAlgorithm(data);
        System.out.println("Comparison amount: " + formatNumbers(strategy.getCounter()));
        System.out.println("Time: " + formatNumbers(strategy.getTime()) + "ms");
    }

    public void printNumbers(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
            if (i > 0 && i % 400 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public String formatNumbers(long l) {
        return new DecimalFormat("###,###.###").format(l);
    }
}
