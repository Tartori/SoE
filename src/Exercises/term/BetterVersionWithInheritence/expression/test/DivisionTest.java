package Exercises.term.BetterVersionWithInheritence.expression.test;

import Exercises.term.BetterVersionWithInheritence.Constant;
import Exercises.term.BetterVersionWithInheritence.Context;
import Exercises.term.BetterVersionWithInheritence.Term;
import Exercises.term.BetterVersionWithInheritence.expression.Addition;
import Exercises.term.BetterVersionWithInheritence.expression.Division;
import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {
    @Test
    public void addTwoPositive() {
        calculateTwoConstants(32,3);
    }
    @Test
    public void addMaxValue() {
        calculateTwoConstants(Integer.MAX_VALUE,3);
    }
    @Test
    public void addMaxWithMinValue() {
        calculateTwoConstants(Integer.MAX_VALUE,Integer.MIN_VALUE);
    }

    private void calculateTwoConstants(int left, int right){
        int expected = left/right;
        Term t = generateExpressionWithTwoConstants(left, right);
        Assert.assertEquals(expected, t.eval(new Context()));
    }


    private Term generateExpressionWithTwoConstants(int leftValue, int rightValue) {
        Term left = new Constant(leftValue);
        Term right = new Constant(rightValue);
        return new Division(left, right);
    }
}
