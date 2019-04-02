package com.vadymlopatka.concurrentjava.threadSafety;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IT IS NOT THREAD SAFE !!!
 */
@RestController
@RequestMapping("/api")
public class WrongHitCounter {
    private int hitCounter = 0;

    @GetMapping("/wrong-hit")
    public int addHit() {
        return ++hitCounter;
    }
}

