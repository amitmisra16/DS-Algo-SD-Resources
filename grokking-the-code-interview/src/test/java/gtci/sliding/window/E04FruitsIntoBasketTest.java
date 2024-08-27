package gtci.sliding.window;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class E04FruitsIntoBasketTest {
    private final E04FruitsIntoBasket fruitBasket = new E04FruitsIntoBasket();
    @Test
    public void test() {
        Assert.assertEquals(3, fruitBasket.compute(new Character[]{'A', 'B', 'C', 'A', 'C'}).intValue());
        Assert.assertEquals(5, fruitBasket.compute(new Character[]{'A', 'B', 'C', 'B', 'B', 'C'}).intValue());
    }

    @Test
    public void testV2() {
        Assert.assertEquals(3, fruitBasket.computeV2(2, new Character[]{'A', 'B', 'C', 'A', 'C'}));
        Assert.assertEquals(5, fruitBasket.computeV2(2, new Character[]{'A', 'B', 'C', 'B', 'B', 'C'}));
    }
}
