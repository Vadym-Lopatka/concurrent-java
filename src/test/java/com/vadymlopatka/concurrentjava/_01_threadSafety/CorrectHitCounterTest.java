package com.vadymlopatka.concurrentjava._01_threadSafety;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CorrectHitCounterTest {
    private CorrectHitCounter hitCounter;

    @Before
    public void setUp() throws Exception {
        hitCounter = new CorrectHitCounter();
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