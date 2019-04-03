package com.vadymlopatka.concurrentjava._01_threadSafety;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * thread safe
 */
@RestController
@RequestMapping("/api")
public class CorrectHitCounter {

    private final AtomicInteger hitCounter = new AtomicInteger(0);

    @GetMapping("/correct-hit")
    public int addHit() {
        return hitCounter.incrementAndGet();
    }


    public int getHitCounter() {
        return hitCounter.intValue();
    }
}