package Exercises.term.BetterVersionWithInheritence.test;

import Exercises.term.BetterVersionWithInheritence.Constant;
import Exercises.term.BetterVersionWithInheritence.Context;
import Exercises.term.BetterVersionWithInheritence.Term;
import org.junit.Assert;
import org.junit.Test;

public class ConstantTest {
    @Test
    public void testCreateConstantFive() {
        testCreateConstantOfValue(5);
    }

    @Test
    public void testCreateConstantZero() {
        testCreateConstantOfValue(0);
    }

    @Test
    public void testCreateConstantNegativeTwo() {
        testCreateConstantOfValue(-2);
    }

    @Test
    public void testCreateConstantMaxValue() {
        testCreateConstantOfValue(Integer.MAX_VALUE);
    }

    @Test
    public void testCreateConstantMinValue() {
        testCreateConstantOfValue(Integer.MIN_VALUE);
    }

    public void testCreateConstantOfValue(int value) {
        int expected = value;
        Term t = new Constant(expected);
        int actual = t.eval(new Context());
        Assert.assertEquals(expected, actual);
    }
}
