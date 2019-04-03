package com.vadymlopatka.concurrentjava._02_atomicity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicReference;

/**
 * thread safe
 */
@RestController
@RequestMapping("/api")
public class CorrectAtomicity {
    private final AtomicReference<Integer> numberA = new AtomicReference<Integer>();
    private final AtomicReference<Integer> numberB = new AtomicReference<Integer>();

    //todo: consider example where we need to change several state variables in concurrent env
    //todo: make a guard by synchronization blocks
    //todo: emphasize atomicity(transactional) concept
}
