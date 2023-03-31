package test.task2;
import main.task3.FindElem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindElemTest {

    @Test
    public void testExists() {
        int[] input = new int[]{1, 2, 3, 5, 8, 11, 13, 21, 17, 59};

        assertTrue(FindElem.exists(5, input));
        assertFalse(FindElem.exists(10, input));
    }

    @Test
    public void testTimeEfficiency() {
        int[] input = new int[1000000];
        for (int i = 0; i < input.length; i++) {
            input[i] = i;
        }

        assertTrue(FindElem.exists(67867, input));
    }
}