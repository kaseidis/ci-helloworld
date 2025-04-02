import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testFindLastNull() {
        // Do not execute fault
        assertThrows(NullPointerException.class, () -> {ArrayUtils.findLast(null, 3);});
    }


    @Test
    public void testFindLastEmpty() {
        // For any input where y appears in the second or later position, there is no error. Also,
        // if x is empty, there is no error.
        assertEquals(-1, ArrayUtils.findLast(new int[]{}, 3));
    }

    @Test
    public void testFindLastNonExistent() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{1, 2}, 3));
    }

    @Test
    public void testFindLastExistsFirstElement() {
        assertEquals(0, ArrayUtils.findLast(new int[]{2, 3, 5}, 2));
    }

    @Test
    public void testOddOrPosNull() {
        // Do not execute fault
        assertThrows(NullPointerException.class, () -> {ArrayUtils.oddOrPos(null);});
    }


    @Test
    public void testOddOrPosAllPositives() {
        // Any nonempty x with only non-negative elements works, because the first part of the
        // compound if-test is not necessary unless the value is negative.
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{1, 2, 3}));
    }

    @Test
    public void testOddOrPositiveBothPositivesAndNegatives() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{-3, -2, 0, 1, 4}));
    }

    // Test for the findLast method
    @Test
    public void testFindLastWithNullArray() {
        // Test for NullPointerException
        assertThrows(NullPointerException.class, () -> ArrayUtils.findLast(null, 5));
    }

    @Test
    public void testFindLastWithEmptyArray() {
        // Edge case for empty array
        int[] arr = {};
        assertEquals(-1, ArrayUtils.findLast(arr, 5));
    }

    @Test
    public void testFindLastWithSingleElementMatch() {
        // Single element that matches the target value
        int[] arr = {5};
        assertEquals(0, ArrayUtils.findLast(arr, 5));
    }

    @Test
    public void testFindLastWithSingleElementNoMatch() {
        // Single element that does not match the target value
        int[] arr = {3};
        assertEquals(-1, ArrayUtils.findLast(arr, 5));
    }

    @Test
    public void testFindLastWithElementAtBeginning() {
        // Target value is at the beginning of the array
        int[] arr = {2, 3, 5, 4};
        assertEquals(0, ArrayUtils.findLast(arr, 2));
    }

    @Test
    public void testFindLastWithElementAtEnd() {
        // Target value is at the end of the array
        int[] arr = {1, 2, 3, 5};
        assertEquals(3, ArrayUtils.findLast(arr, 5));
    }

    @Test
    public void testFindLastWithMultipleOccurrences() {
        // Target value appears multiple times, should return the index of the last occurrence
        int[] arr = {2, 5, 3, 2, 4};
        assertEquals(3, ArrayUtils.findLast(arr, 2));
    }

    @Test
    public void testFindLastWithNoMatch() {
        // Target value does not exist in the array
        int[] arr = {1, 2, 3, 4};
        assertEquals(-1, ArrayUtils.findLast(arr, 5));
    }

    // Test for the oddOrPos method
    @Test
    public void testOddOrPosWithNullArray() {
        // Test for NullPointerException
        assertThrows(NullPointerException.class, () -> ArrayUtils.oddOrPos(null));
    }

    @Test
    public void testOddOrPosWithEmptyArray() {
        // Edge case for empty array
        int[] arr = {};
        assertEquals(0, ArrayUtils.oddOrPos(arr));
    }

    @Test
    public void testOddOrPosWithOnlyPositiveEvenNumbers() {
        // Array containing only positive even numbers
        int[] arr = {2, 4, 6, 8};
        assertEquals(4, ArrayUtils.oddOrPos(arr)); // All numbers are positive, count is 4
    }

    @Test
    public void testOddOrPosWithOnlyNegativeEvenNumbers() {
        // Array containing only negative even numbers
        int[] arr = {-2, -4, -6, -8};
        assertEquals(0, ArrayUtils.oddOrPos(arr)); // No odd or positive numbers
    }

    @Test
    public void testOddOrPosWithOnlyNegativeOddNumbers() {
        // Array containing only negative odd numbers
        int[] arr = {-1, -3, -5, -7};
        assertEquals(4, ArrayUtils.oddOrPos(arr)); // All numbers are odd, count is 4
    }

    @Test
    public void testOddOrPosWithOnlyPositiveOddNumbers() {
        // Array containing only positive odd numbers
        int[] arr = {1, 3, 5, 7};
        assertEquals(4, ArrayUtils.oddOrPos(arr)); // All numbers are odd and positive, count is 4
    }

    @Test
    public void testOddOrPosWithMixedEvenNumbers() {
        // Array containing a mix of negative even numbers, zero, and positive even numbers
        int[] arr = {-8, -6, -4, -2, 0, 2, 4, 6};
        assertEquals(3, ArrayUtils.oddOrPos(arr)); // Only 2, 4, 6, and 8 are positive
    }

    @Test
    public void testOddOrPosWithMixedNumbers() {
        // Array containing a mix of odd/even, positive/negative, and zero values
        int[] arr = {-3, -2, 0, 1, 4};
        assertEquals(3, ArrayUtils.oddOrPos(arr)); // -3 is odd, 1 is odd and positive, 4 is positive
    }

    @Test
    public void testOddOrPosWithZeroOnly() {
        // Array containing only zero
        int[] arr = {0};
        assertEquals(0, ArrayUtils.oddOrPos(arr)); // 0 is neither odd nor positive
    }

    // Test for the countOf method
    @Test
    public void testCountOfWithNullArray() {
        // Test for NullPointerException
        assertThrows(NullPointerException.class, () -> ArrayUtils.countOf(null, 5));
    }

    @Test
    public void testCountOfWithEmptyArray() {
        // Edge case for empty array
        int[] arr = {};
        assertEquals(0, ArrayUtils.countOf(arr, 5));
    }

    @Test
    public void testCountOfWithSingleElementMatch() {
        // Single element that matches the target value
        int[] arr = {5};
        assertEquals(1, ArrayUtils.countOf(arr, 5));
    }

    @Test
    public void testCountOfWithSingleElementNoMatch() {
        // Single element that does not match the target value
        int[] arr = {3};
        assertEquals(0, ArrayUtils.countOf(arr, 5));
    }

    @Test
    public void testCountOfWithOneOccurrence() {
        // Target value appears only once
        int[] arr = {1, 2, 5, 3, 4};
        assertEquals(1, ArrayUtils.countOf(arr, 5));
    }

    @Test
    public void testCountOfWithMultipleOccurrences() {
        // Target value appears multiple times
        int[] arr = {5, 2, 5, 3, 5, 1};
        assertEquals(3, ArrayUtils.countOf(arr, 5));
    }

    @Test
    public void testCountOfWithNoMatch() {
        // Target value does not exist in the array
        int[] arr = {1, 2, 3, 4};
        assertEquals(0, ArrayUtils.countOf(arr, 5));
    }


}