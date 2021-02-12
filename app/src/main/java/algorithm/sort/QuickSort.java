package algorithm.sort;

public class QuickSort extends Sort {
    @Override
    protected int[] sort(int[] ints) {
        super.sort(ints);

        quickSort(ints, 0, ints.length - 1);
        return ints;
    }

    private void quickSort(int[] ints, int start, int end) {
        if (start < end) {
            int partition = getPartition(ints, start, end);
            quickSort(ints, start, partition - 1);
            quickSort(ints, partition + 1, end);
        }
    }

    private int getPartition(int[] ints, int start, int end) {
        int partition = start;
        for (int i = start + 1; i <= end; i++) {
            if (ints[i] < ints[start]) {
                swap(ints, i, ++partition);
            }
        }
        swap(ints, start, partition);

        printResult(ints);
        return partition;
    }

    private void swap(int[] ints, int i1, int i2) {
        int temp = ints[i1];
        ints[i1] = ints[i2];
        ints[i2] = temp;
    }
}
