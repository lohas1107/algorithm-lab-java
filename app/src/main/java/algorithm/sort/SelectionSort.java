package algorithm.sort;

public class SelectionSort extends Sort {
    @Override
    protected int[] sort(int[] ints) {
        super.sort(ints);

        for (int i = 0; i < ints.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[j] < ints[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = ints[minIndex];
            ints[minIndex] = ints[i];
            ints[i] = temp;

            printResult(ints);
        }
        return ints;
    }
}
