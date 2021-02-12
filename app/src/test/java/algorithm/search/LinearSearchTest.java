package algorithm.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearSearchTest {

    private final LinearSearch linearSearch = new LinearSearch();

    @Test
    public void linear_search_1() {
        resultShouldBe(6, new int[]{3, 9, 8, 2, 1, 4, 6, 5, 7}, 6);
    }

    @Test
    public void linear_search_2() {
        resultShouldBe(6, new int[]{7, 9, 6, 2, 4, 3, 1, 8, 5}, 1);
    }

    @Test
    public void linear_search_3() {
        resultShouldBe(-1, new int[]{7, 9, 6, 2, 4, 3, 1, 8, 5}, 0);
    }

    private void resultShouldBe(int expected, int[] ints, int target) {
        assertEquals(expected, linearSearch.search(ints, target));
    }
}
