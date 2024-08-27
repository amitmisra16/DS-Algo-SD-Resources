package gtci.sliding.window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E03LongestSubstringWithGivenDistinctCharsTest {

    E03LongestSubstringWithGivenDistinctChars e03 = new E03LongestSubstringWithGivenDistinctChars();
    @Test
    public void test() {
        Assertions.assertAll(
                () -> assertEquals(e03.compute(2, "araaci"), 4),
                () -> assertEquals(e03.compute(1, "araaci"), 2),
                () -> assertEquals(e03.compute(3, "cbbebi"), 5),
                () -> assertEquals(e03.compute(3, "william"), 5),
                () -> assertEquals(e03.compute(4, "william"), 6),
                () -> assertEquals(e03.compute(2, "william"), 4)
        );
    }
    @Test
    public void testV2() {
        Assertions.assertAll(
                () -> assertEquals(e03.computeV2(2, "araaci"), 4),
                () -> assertEquals(e03.computeV2(1, "araaci"), 2),
                () -> assertEquals(e03.computeV2(3, "cbbebi"), 5),
                () -> assertEquals(e03.computeV2(3, "william"), 5),
                () -> assertEquals(e03.computeV2(4, "william"), 6),
                () -> assertEquals(e03.computeV2(2, "william"), 4)
        );
    }
}
