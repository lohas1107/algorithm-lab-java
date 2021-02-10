package algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    private final BubbleSort bubbleSort = new BubbleSort();
    private final int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    public void bubble_sort_1() {
        resultShouldBe(expected, new int[]{5, 9, 3, 1, 2, 8, 4, 7, 6});
    }

    @Test
    public void bubble_sort_2() {
        resultShouldBe(expected, new int[]{8, 7, 6, 4, 5, 1, 2, 3, 9});
    }

    @Test
    public void bubble_sort_3() {
        resultShouldBe(expected, new int[]{5, 7, 6, 3, 2, 4, 8, 9, 1});
    }

    private void resultShouldBe(int[] expected, int[] ints) {
        assertArrayEquals(expected, bubbleSort.sort(ints));
    }

}
