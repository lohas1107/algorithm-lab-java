package algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    private final Sort mergeSort = new MergeSort();

    @Test
    public void merge_sort_1() {
        resultShouldBe(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{3, 9, 5, 4, 1, 6, 8, 7, 2});
    }

    @Test
    public void merge_sort_2() {
        resultShouldBe(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{5, 7, 4, 6, 1, 9, 3, 2, 8});
    }

    private void resultShouldBe(int[] expected, int[] ints) {
        assertArrayEquals(expected, mergeSort.sort(ints));
    }
}
