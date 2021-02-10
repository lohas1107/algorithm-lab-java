package algorithm.sort;

import java.util.Arrays;

public class Sort {
    protected int[] sort(int[] ints) {
        System.out.println();
        printResult(ints);

        return ints;
    }

    protected void printResult(int[] ints) {
        System.out.println(Arrays.toString(ints));
    }
}
