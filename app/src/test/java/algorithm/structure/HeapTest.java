package algorithm.structure;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HeapTest {

    private final Heap heap = new Heap();

    @Test
    public void min_heap() {
        minResultShouldBe(new int[]{1, 2, 3, 6, 4, 5, 7}, new int[]{2, 1, 5, 6, 4, 3, 7});
    }

    @Test
    public void max_heap() {
        maxResultShouldBe(new int[]{7, 6, 5, 1, 4, 3, 2}, new int[]{2, 1, 5, 6, 4, 3, 7});
    }

    private void maxResultShouldBe(int[] expected, int[] ints) {
        assertArrayEquals(expected, heap.maxHeap(ints));
    }

    private void minResultShouldBe(int[] expected, int[] ints) {
        assertArrayEquals(expected, heap.minHeap(ints));
    }
}
