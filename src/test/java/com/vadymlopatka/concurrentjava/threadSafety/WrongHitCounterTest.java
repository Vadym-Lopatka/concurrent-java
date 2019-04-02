package com.vadymlopatka.concurrentjava.threadSafety;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WrongHitCounterTest {
    private WrongHitCounter wrongHitCounter;

    @Before
    public void setUp() throws Exception {
        wrongHitCounter = new WrongHitCounter();
    }

    @Test
    public void hitCounterHasInitialValueEqualZeroTest() {
        Assert.assertEquals(wrongHitCounter.getHitCounter(), 0);
    }

    @Test
    public void hitCounterIncrementedTest() {
        Assert.assertEquals(wrongHitCounter.addHit(), 1);
    }

    @Test
    public void hitCounterIncrementedSeveralTimesTest() {
        wrongHitCounter.addHit(); // 1
        wrongHitCounter.addHit(); // 2

        Assert.assertEquals(wrongHitCounter.addHit(), 3);
    }
}