package gtci.sliding.window;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P01PermutationInAStringTest {

    P01PermutationInAString p01PermutationInAString = new P01PermutationInAString();
    @Test
    public void test() {
        Assertions.assertAll(
                () -> Assert.assertTrue(p01PermutationInAString.compute("abc", "oidbcaf")),
                () -> Assert.assertTrue(p01PermutationInAString.compute("abc", "oidbbcaf")),
                () -> Assert.assertFalse(p01PermutationInAString.compute("dc", "odicf")),
                () -> Assert.assertTrue(p01PermutationInAString.compute("bcdyabcdx", "bcdxabcdy")),
                () -> Assert.assertTrue(p01PermutationInAString.compute("abc", "aaacb"))

        );
    }
}
