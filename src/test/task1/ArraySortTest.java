package test.task1;
import main.task2.ArraySort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ArraySortTest {

    @Test
    public void testSort() {
        int[] input = new int[]{1, 7, 3, -4, 34, -11, 56};
        int[] expected = new int[]{-11, -4, 1, 3, 7, 34, 56};
        ArraySort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortWithDuplicates() {
        int[] input = new int[]{5, 22, 0, 3, 3, 22, 5};
        int[] expected = new int[]{0, 3, 3, 5, 5, 22, 22};
        ArraySort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortWithSingleElement() {
        int[] input = new int[]{69};
        int[] expected = new int[]{69};
        ArraySort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortWithEmptyArray() {
        int[] input = new int[0];
        int[] expected = new int[0];
        ArraySort.sort(input);
        assertArrayEquals(expected, input);
    }
}