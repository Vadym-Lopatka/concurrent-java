package com.vadymlopatka.concurrentjava.threadSafety;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * thread safe
 */
@RestController
@RequestMapping("/api")
public class RightHitCounter {

    private final AtomicInteger hitCounter = new AtomicInteger(0);

    @GetMapping("/right-hit")
    public int addHit() {
        return hitCounter.incrementAndGet();
    }


    public int getHitCounter() {
        return hitCounter.intValue();
    }
}