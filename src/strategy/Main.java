package strategy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        int[] arrayToSort = generateNumbers();

        System.out.println("------------------------------");
        System.out.println("Sorted with quick sort:");
        context.chooseStrategy("quick", arrayToSort);

        System.out.println("------------------------------");
        System.out.println("Sorted with merge sort:");
        context.chooseStrategy("merge", arrayToSort);

        System.out.println("------------------------------");
        System.out.println("Sorted with bubble sort:");
        context.chooseStrategy("bubble", arrayToSort);
    }

    private static int[] generateNumbers() {
        int n = 70000;
        int[] arrayToSort = new int[n];
        Random r = new Random();
        System.out.println("------------------------------");
        System.out.println("Items to be sorted:");
        for (int i = 0; i < n; i++) {
            arrayToSort[i] = r.nextInt(1000);
            System.out.print(arrayToSort[i] + " ");
            if (i > 0 && i % 400 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        return arrayToSort;
    }
}
