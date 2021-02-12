package algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    private final Sort quickSort = new QuickSort();

    @Test
    public void quick_sort_1() {
        resultShouldBe(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{3, 5, 8, 1, 2, 9, 4, 7, 6});
    }

    @Test
    public void quick_sort_2() {
        resultShouldBe(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{5, 7, 4, 6, 1, 9, 3, 2, 8});
    }

    private void resultShouldBe(int[] expected, int[] ints) {
        assertArrayEquals(expected, quickSort.sort(ints));
    }
}
