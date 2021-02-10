package algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void bubble_sort_1() {
        BubbleSort bubbleSort = new BubbleSort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, bubbleSort.sort(new int[]{5, 9, 3, 1, 2, 8, 4, 7, 6}));
    }

    @Test
    public void bubble_sort_2() {
        BubbleSort bubbleSort = new BubbleSort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, bubbleSort.sort(new int[]{8, 7, 6, 4, 5, 1, 2, 3, 9}));
    }

    @Test
    public void bubble_sort_3() {
        BubbleSort bubbleSort = new BubbleSort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, bubbleSort.sort(new int[]{5, 7, 6, 3, 2, 4, 8, 9, 1}));
    }

}
