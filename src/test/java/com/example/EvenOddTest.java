
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddTest {

    @Test
    void testEvenNumber() {
        assertEquals("Even", EvenOdd.checkNumber(4));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd", EvenOdd.checkNumber(7));
    }

    @Test
    void testZeroIsEven() {
        assertEquals("Even", EvenOdd.checkNumber(0));
    }
}
