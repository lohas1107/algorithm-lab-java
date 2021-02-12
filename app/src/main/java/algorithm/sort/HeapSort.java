package algorithm.sort;

import algorithm.structure.Heap;

public class HeapSort extends Sort {
    @Override
    protected int[] sort(int[] ints) {
        Heap heap = new Heap();
        ints = heap.buildMaxHeap(ints);

        for (int i = ints.length - 1; i > 0; i--) {
            int temp = ints[i];
            ints[i] = ints[0];
            ints[0] = temp;

            heap.maxHeapify(ints, i, 0);
        }
        return ints;
    }
}
