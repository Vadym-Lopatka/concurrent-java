package com.vadymlopatka.concurrentjava.threadSafety;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RightHitCounterTest {
    private RightHitCounter hitCounter;

    @Before
    public void setUp() throws Exception {
        hitCounter = new RightHitCounter();
    }

    @Test
    public void hitCounterHasInitialValueEqualZeroTest() {
        Assert.assertEquals(hitCounter.getHitCounter(), 0);
    }

    @Test
    public void hitCounterIncrementedTest() {
        Assert.assertEquals(hitCounter.addHit(), 1);
    }

    @Test
    public void hitCounterIncrementedSeveralTimesTest() {
        hitCounter.addHit(); // 1
        hitCounter.addHit(); // 2

        Assert.assertEquals(hitCounter.addHit(), 3);
    }
}