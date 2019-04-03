package com.vadymlopatka.concurrentjava._02_atomicity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicReference;

/**
 * thread safe
 */
@RestController
@RequestMapping("/api")
public class IncorrectAtomicity {
    private final AtomicReference<Integer> numberA = new AtomicReference<Integer>();
    private final AtomicReference<Integer> numberB = new AtomicReference<Integer>();

}
