package gtci.sliding.window;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class E06LongestSubstringWithSameLettersAfterReplacementTest {

    E06LongestSubstringWithSameLettersAfterReplacement e06LongestSubstringWithSameLettersAfterReplacement = new E06LongestSubstringWithSameLettersAfterReplacement();

    @Test
    public void test() {
        Assertions.assertAll(
                () -> Assert.assertEquals(5, e06LongestSubstringWithSameLettersAfterReplacement.compute(2, "aabccbb")),
                () -> Assert.assertEquals(4, e06LongestSubstringWithSameLettersAfterReplacement.compute(1, "abbcb")),
                () -> Assert.assertEquals(3, e06LongestSubstringWithSameLettersAfterReplacement.compute(1, "abccde")),
                () -> Assert.assertEquals(5, e06LongestSubstringWithSameLettersAfterReplacement.compute(2, "ababa")),
                () -> Assert.assertEquals(6, e06LongestSubstringWithSameLettersAfterReplacement.compute(4, "hhhhhh"))
        );
    }
}
