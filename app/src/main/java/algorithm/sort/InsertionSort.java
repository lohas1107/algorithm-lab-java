package algorithm.sort;

public class InsertionSort extends Sort {
    @Override
    protected int[] sort(int[] ints) {
        super.sort(ints);

        for (int i = 1; i < ints.length; i++) {
            for (int j = 0; j < i; j++) {
                if (ints[j] > ints[i]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
            printResult(ints);
        }
        return ints;
    }
}
