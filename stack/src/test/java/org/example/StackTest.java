package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    void canCreateEmptyStack() {
        var stack = new Stack();

        Assertions.assertTrue(stack.isEmpty());
    }
}
