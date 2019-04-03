package com.vadymlopatka.concurrentjava._01_threadSafety;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IT IS NOT THREAD SAFE !!!
 */
@RestController
@RequestMapping("/api")
public class IncorrectHitCounter {
    private int hitCounter = 0;

    @GetMapping("/incorrect-hit")
    public int addHit() {
        return ++hitCounter;
    }

    public int getHitCounter() {
        return hitCounter;
    }
}

