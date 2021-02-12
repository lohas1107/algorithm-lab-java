package algorithm.search;

public class LinearSearch {
    public int search(int[] ints, int target) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
