package algorithm;

public class BubbleSort extends Sort {
    public int[] sort(int[] ints) {
        super.sort(ints);

        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
            printResult(ints);
        }
        return ints;
    }

}
