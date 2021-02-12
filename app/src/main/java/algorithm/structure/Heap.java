package algorithm.structure;

public class Heap {

    private final int ASCENDING = -1;
    private final int DESCENDING = 1;

    public int[] buildMinHeap(int[] ints) {
        for (int i = ints.length / 2; i >= 0; i--) {
            minHeapify(ints, i);
        }
        return ints;
    }

    public int[] buildMaxHeap(int[] ints) {
        for (int i = ints.length / 2; i >= 0; i--) {
            maxHeapify(ints, i);
        }
        return ints;
    }

    private void minHeapify(int[] ints, int i) {
        heapify(ints, ints.length, i, ASCENDING);
    }

    private void maxHeapify(int[] ints, int i) {
        heapify(ints, ints.length, i, DESCENDING);
    }

    public void maxHeapify(int[] ints, int length, int i) {
        heapify(ints, length, i, DESCENDING);
    }

    private void heapify(int[] ints, int length, int index, int order) {
        int targetIndex = index;
        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;

        if (length > leftIndex && Integer.compare(ints[leftIndex], ints[targetIndex]) == order) {
            targetIndex = leftIndex;
        }
        if (length > rightIndex && Integer.compare(ints[rightIndex], ints[targetIndex]) == order) {
            targetIndex = rightIndex;
        }

        if (targetIndex != index) {
            int temp = ints[index];
            ints[index] = ints[targetIndex];
            ints[targetIndex] = temp;

            heapify(ints, length, targetIndex, order);
        }
    }

}
