package gtci.sliding.window;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class E08LongestSubArrayOfOnesAfterKReplacementTest {
    E08LongestSubArrayOfOnesAfterKReplacement e08LongestSubArrayOfOnesAfterKReplacement = new E08LongestSubArrayOfOnesAfterKReplacement();
    @Test
    public void test() {
        Assertions.assertAll(
                () -> Assert.assertEquals(6, e08LongestSubArrayOfOnesAfterKReplacement.compute(2, new int[]{0,1,1,0,0,0,1,1,0,1,1})),
                () -> Assert.assertEquals(9, e08LongestSubArrayOfOnesAfterKReplacement.compute(3, new int[]{0,1,0,0,1,1,0,1,1,0,0,1,1}))
        );
    }
}
