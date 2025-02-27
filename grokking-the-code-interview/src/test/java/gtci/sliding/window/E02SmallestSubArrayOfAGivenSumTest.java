package gtci.sliding.window;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class E02SmallestSubArrayOfAGivenSumTest {

    private final E02SmallestSubArrayForGivenSizeMaxTotal e02SmallestSubArrayForGivenSizeMaxTotal = new E02SmallestSubArrayForGivenSizeMaxTotal();

    @Test
    public void testSmallestSubArrayWithGivenSum() {
        Assertions.assertAll(
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.compute(List.of(2, 5, 1, 3, 2), 7), 2),
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.compute(List.of(2, 5, 1, 7, 2), 7), 1),
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.compute(List.of(2, 1, 5, 2, 8), 7), 1),
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.compute(List.of(3, 4, 1, 1, 6), 8), 3),
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.compute(List.of(3, 4, 1, 2, 6), 8), 2)
        );
    }

    @Test
    public void testSmallestSubArrayWithGivenSumV2() {
        Assertions.assertAll(
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.computeV3(new int[]{2, 5, 1, 3, 2}, 7), 2),
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.computeV3(new int[]{2, 5, 1, 7, 2}, 7), 1),
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.computeV3(new int[]{2, 1, 5, 2, 8}, 7), 1),
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.computeV3(new int[]{3, 4, 1, 1, 6}, 8), 3),
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.computeV3(new int[]{3, 4, 1, 2, 6}, 8), 2)
        );
    }

    @Test
    public void testV2() {
        Assertions.assertAll(
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.computeV2(List.of(2, 5, 1, 3, 2), 3), 9),
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.computeV2(List.of(2, 5, 1, 7, 2), 3), 13),
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.computeV2(List.of(2, 1, 5, 2, 8), 2), 10),
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.computeV2(List.of(3, 4, 1, 1, 6), 4), 12),
                () -> Assert.assertEquals(e02SmallestSubArrayForGivenSizeMaxTotal.computeV2(List.of(3, 4, 1, 2, 6), 3), 9)
        );
    }

}
