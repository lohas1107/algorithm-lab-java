package algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    private final Sort selectionSort = new SelectionSort();
    private final int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    public void selection_sort_1() {
        resultShouldBe(expected, new int[]{5, 7, 6, 3, 2, 4, 8, 9, 1});
    }

    @Test
    public void selection_sort_2() {
        resultShouldBe(expected, new int[]{9, 7, 6, 1, 4, 5, 2, 8, 3});
    }

    private void resultShouldBe(int[] expected, int[] ints) {
        assertArrayEquals(expected, selectionSort.sort(ints));
    }
}
