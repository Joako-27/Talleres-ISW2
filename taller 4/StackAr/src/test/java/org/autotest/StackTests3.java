package org.autotest;

import java.util.ArrayList;

import org.eclipse.jdt.internal.core.util.ExceptionAttribute;

import static org.junit.jupiter.api.Assertions.*;

public class StackTests3 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() {
        return false;
    }

    // Tests de StackTests2

    public void testSizeIncreasesByOne() throws Exception {
        Stack stack = createStack();
        assertEquals(0, stack.size());
        stack.push(42);
        assertEquals(1, stack.size());
    }

    public void testDefaultConstructor() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
    }

    public void testConstructorWithSpecifiedCapacity() throws Exception {
        Stack stack = createStack(5);
    }

    public void testConstructorWithNegativeCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            Stack stack = createStack(-1);
        });
    }

    public void testIsEmptyMethod() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
        stack.push(42);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    public void testIsFullMethod() throws Exception {
        Stack stack = createStack(1);
        assertFalse(stack.isFull());
        stack.push(42);
        assertTrue(stack.isFull());
        stack.pop();
        assertFalse(stack.isFull());
    }

    public void testToStringMethod() throws Exception {
        Stack stack = createStack(2);
        assertEquals("[]", stack.toString());
        stack.push(42);
        assertEquals("[42]", stack.toString());
        stack.push(43);
        assertEquals("[42,43]", stack.toString());
    }

    // COMPLETAR

    public void testPop() throws Exception{
        Stack stack = createStack(2);
        stack.push(1);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals("[1]", stack.toString());
        assertEquals(1, stack.top());
        assertEquals(1, stack.size());
        assertEquals(1, stack.pop());
        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());
        assertFalse(stack.isFull());
        assertThrows(IllegalStateException.class, () -> {stack.pop();});
    }

    public void testPush() throws Exception{
        Stack stack = createStack(2);
        stack.push(1);
        assertFalse(stack.isEmpty());
        assertFalse(stack.isFull());
        assertEquals(1, stack.top());
        stack.push(3);
        assertTrue(stack.isFull());
        assertEquals(3, stack.top());
        assertThrows(IllegalStateException.class, () -> {stack.push(2);});
    }

    public void testEquals() throws Exception{
        Stack stack1 = createStack(10);
        stack1.push(13);
        stack1.push(14);
        stack1.push(11);
        stack1.push(15);
        Stack stack2 = createStack(10);
        stack2.push(13);
        stack2.push(14);
        stack2.push(11);
        stack2.push(15);
        assertTrue(stack1.equals(stack2));
        stack1.pop();
        assertFalse(stack2.equals(stack1));
        Stack stack3 = createStack(9);
        stack2.push(13);
        stack2.push(14);
        stack2.push(11);
        assertFalse(stack1.equals(stack3));
        Stack stack4 = null;
        assertFalse(stack1.equals(stack4));
        int a = 5;
        assertFalse(stack1.equals(a));
        assertTrue(stack1.equals(stack1));
        Stack stack5 = createStack(0);
        assertFalse(stack1.equals(stack5));
    }

    public void testHashcode() throws Exception{
        Stack stack1 = createStack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        Stack stack2 = createStack();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        assertEquals(stack1.hashCode(), stack2.hashCode());
        stack1.pop();
        assertNotEquals(stack1.hashCode(), stack2.hashCode());
    }

    public void testConstructor() {
        assertDoesNotThrow(() -> {Stack stack = createStack();}); //tratando de hacer saltar el mutante 4527
    }

    public void testTop() throws Exception{
        Stack stack = createStack(5);
        stack.push(1);
        assertEquals(1, stack.top());
        stack.push(2);
        assertEquals(2, stack.top());
        stack.pop();
        assertEquals(1, stack.top());
        stack.pop();
        assertThrows(IllegalStateException.class, () -> {stack.top();});
    }
}
