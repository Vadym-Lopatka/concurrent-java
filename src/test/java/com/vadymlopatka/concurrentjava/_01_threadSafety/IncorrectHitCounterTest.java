package com.vadymlopatka.concurrentjava._01_threadSafety;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IncorrectHitCounterTest {
    private IncorrectHitCounter incorrectHitCounter;

    @Before
    public void setUp() throws Exception {
        incorrectHitCounter = new IncorrectHitCounter();
    }

    @Test
    public void hitCounterHasInitialValueEqualZeroTest() {
        Assert.assertEquals(incorrectHitCounter.getHitCounter(), 0);
    }

    @Test
    public void hitCounterIncrementedTest() {
        Assert.assertEquals(incorrectHitCounter.addHit(), 1);
    }

    @Test
    public void hitCounterIncrementedSeveralTimesTest() {
        incorrectHitCounter.addHit(); // 1
        incorrectHitCounter.addHit(); // 2

        Assert.assertEquals(incorrectHitCounter.addHit(), 3);
    }
}