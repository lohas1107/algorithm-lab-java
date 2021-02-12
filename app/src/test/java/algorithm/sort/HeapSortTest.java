package algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HeapSortTest {

    private final Sort heapSort = new HeapSort();

    @Test
    public void heap_sort_1() {
        resultShouldBe(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{5, 9, 3, 1, 2, 8, 4, 7, 6});
    }

    @Test
    public void heap_sort_2() {
        resultShouldBe(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{5, 2, 6, 1, 7, 3, 8, 4, 9});
    }

    private void resultShouldBe(int[] expected, int[] ints) {
        assertArrayEquals(expected, heapSort.sort(ints));
    }
}
