package gtci.sliding.window;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class E01AverageOfAllSubArraysOfAGivenSizeTest {

    private E01AverageOfSubArrays aosa = new E01AverageOfSubArrays();

    @Test
    public void testV1() {
        List<Float> averages = aosa.compute(new int[]{1,3,2,6,-1,4,1,8,2}, 5);
        Assert.assertNotNull(averages);
        Assert.assertEquals(averages.size(), 5);
        Assertions.assertAll(
                () -> Assert.assertEquals(averages.get(0), 2.2F),
                () -> Assert.assertEquals(averages.get(1), 2.8F),
                () -> Assert.assertEquals(averages.get(2), 2.4F),
                () -> Assert.assertEquals(averages.get(3), 3.6F),
                () -> Assert.assertEquals(averages.get(4), 2.8F)
        );
    }

    @Test
    public void testV2() {
        List<Float> averages = aosa.computeV2(new int[]{1,3,2,6,-1,4,1,8,2}, 5);
        Assert.assertNotNull(averages);
        Assert.assertEquals(averages.size(), 5);
        Assertions.assertAll(
                () -> Assert.assertEquals(averages.get(0), 2.2F),
                () -> Assert.assertEquals(averages.get(1), 2.8F),
                () -> Assert.assertEquals(averages.get(2), 2.4F),
                () -> Assert.assertEquals(averages.get(3), 3.6F),
                () -> Assert.assertEquals(averages.get(4), 2.8F)
        );
    }

    @Test
    public void testV3() {
        List<Float> averages = aosa.computeV3(new int[]{1,3,2,6,-1,4,1,8,2}, 5);
        Assert.assertNotNull(averages);
        Assert.assertEquals(averages.size(), 5);
        Assertions.assertAll(
                () -> Assert.assertEquals(averages.get(0), 2.2F),
                () -> Assert.assertEquals(averages.get(1), 2.8F),
                () -> Assert.assertEquals(averages.get(2), 2.4F),
                () -> Assert.assertEquals(averages.get(3), 3.6F),
                () -> Assert.assertEquals(averages.get(4), 2.8F)
        );
    }

}
