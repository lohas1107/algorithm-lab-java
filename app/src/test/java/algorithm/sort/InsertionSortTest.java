package algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {

    private final Sort insertionSort = new InsertionSort();
    private final int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    public void insertion_sort_1() {
        resultShouldBe(expected, new int[]{5, 3, 4, 7, 2, 8, 6, 9, 1});
    }

    @Test
    public void insertion_sort_2() {
        resultShouldBe(expected, new int[]{9, 7, 6, 1, 4, 5, 2, 8, 3});
    }

    private void resultShouldBe(int[] expected, int[] ints) {
        assertArrayEquals(expected, insertionSort.sort(ints));
    }
}
