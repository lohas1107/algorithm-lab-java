package algorithm.sort;

public class MergeSort extends Sort {

    @Override
    protected int[] sort(int[] ints) {
        super.sort(ints);

        mergeSort(ints, 0, ints.length - 1);
        return ints;
    }

    private void mergeSort(int[] ints, int start, int end) {
        if (start >= end) {
            return;
        }

        int middle = start + ((end - start) / 2);
        int startMid = middle + 1;

        mergeSort(ints, start, middle);
        mergeSort(ints, startMid, end);

        merge(ints, start, middle, startMid, end);

        printResult(ints);
    }

    private void merge(int[] ints, int start, int middle, int startMid, int end) {
        int i = start;
        int start1 = start;
        int start2 = startMid;
        int[] result = new int[ints.length];

        while (start1 <= middle && start2 <= end) {
            result[i++] = (ints[start1] < ints[start2]) ? ints[start1++] : ints[start2++];
        }
        while (start1 <= middle) {
            result[i++] = ints[start1++];
        }
        while (start2 <= end) {
            result[i++] = ints[start2++];
        }
        for (i = start; i <= end; i++) {
            ints[i] = result[i];
        }
    }
}
