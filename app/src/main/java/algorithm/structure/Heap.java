package algorithm.structure;

public class Heap {

    private final int ASCENDING = -1;
    private final int DESCENDING = 1;

    public int[] minHeap(int[] ints) {
        for (int i = ints.length / 2; i >= 0; i--) {
            heap(ints, i, ASCENDING);
        }
        return ints;
    }

    public int[] maxHeap(int[] ints) {
        for (int i = ints.length / 2; i >= 0; i--) {
            heap(ints, i, DESCENDING);
        }
        return ints;
    }

    private void heap(int[] ints, int i, int order) {
        int targetIndex = i;
        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;

        if (ints.length > leftIndex && Integer.compare(ints[leftIndex], ints[targetIndex]) == order) {
            targetIndex = leftIndex;
        }
        if (ints.length > rightIndex && Integer.compare(ints[rightIndex], ints[targetIndex]) == order) {
            targetIndex = rightIndex;
        }

        if (targetIndex != i) {
            int temp = ints[i];
            ints[i] = ints[targetIndex];
            ints[targetIndex] = temp;

            heap(ints, targetIndex, order);
        }
    }

}
