package gtci.sliding.window;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class E05NoRepeatSubStringTest {
    E05NoRepeatSubString e05NoRepeatSubString = new E05NoRepeatSubString();

    @Test
    public void test() {
        Assertions.assertAll(
                () -> Assert.assertEquals(3, e05NoRepeatSubString.compute("aabccbb")),
                () -> Assert.assertEquals(2, e05NoRepeatSubString.compute("abbbb")),
                () -> Assert.assertEquals(3, e05NoRepeatSubString.compute("abccde"))
        );
    }

    @Test
    public void testV2() {
        Assertions.assertAll(
                () -> Assert.assertEquals(3, e05NoRepeatSubString.computeV2("aabccbb")),
                () -> Assert.assertEquals(2, e05NoRepeatSubString.computeV2("abbbb")),
                () -> Assert.assertEquals(3, e05NoRepeatSubString.computeV2("abccde")),
                () -> Assert.assertEquals(3, e05NoRepeatSubString.computeV2("dvdf")),
                () -> Assert.assertEquals(3, e05NoRepeatSubString.computeV2("pwwkew"))
        );
    }
}
