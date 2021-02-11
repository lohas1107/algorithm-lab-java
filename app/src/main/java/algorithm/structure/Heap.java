package algorithm.structure;

public class Heap {

    public int[] minHeap(int[] ints) {
        for (int i = ints.length / 2; i >= 0; i--) {
            minHeap(ints, i);
        }
        return ints;
    }

    public int[] maxHeap(int[] ints) {
        for (int i = ints.length / 2; i >= 0; i--) {
            maxHeap(ints, i);
        }
        return ints;
    }

    private void minHeap(int[] ints, int i) {
        int minIndex = i;
        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;

        if (ints.length > leftIndex && ints[leftIndex] < ints[minIndex]) {
            minIndex = leftIndex;
        }
        if (ints.length > rightIndex && ints[rightIndex] < ints[minIndex]) {
            minIndex = rightIndex;
        }

        if (minIndex != i) {
            int temp = ints[i];
            ints[i] = ints[minIndex];
            ints[minIndex] = temp;

            minHeap(ints, minIndex);
        }
    }

    private void maxHeap(int[] ints, int i) {
        int maxIndex = i;
        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;

        if (ints.length > leftIndex && ints[leftIndex] > ints[maxIndex]) {
            maxIndex = leftIndex;
        }
        if (ints.length > rightIndex && ints[rightIndex] > ints[maxIndex]) {
            maxIndex = rightIndex;
        }

        if (maxIndex != i) {
            int temp = ints[i];
            ints[i] = ints[maxIndex];
            ints[maxIndex] = temp;

            maxHeap(ints, maxIndex);
        }
    }
}
