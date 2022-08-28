import org.junit.jupiter.api.Test;

import static Task2.Main.mergeSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestTask2 {

    @Test
    public void Test1() {
        int[] actual = { 9, 1, 6, 2, 6, 4 };
        int[] expected = { 1, 2, 4, 6, 6, 9 };
        mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] actual = {7,6,3,1,55,8,0,2,1,3,60,2,5,8,9,10};
        int[] expected = { 0, 1, 1, 2, 2, 3, 3, 5, 6, 7, 8, 8, 9, 10, 55, 60 };
        mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] actual = { -1, 3, -5, 1, 0, 6, 8, 9, 2, 1, 8, 10, 20, 5, 3 };
        int[] expected = { -5, -1, 0, 1, 1, 2, 3, 3, 5, 6, 8, 8, 9, 10, 20 };
        mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }
}
