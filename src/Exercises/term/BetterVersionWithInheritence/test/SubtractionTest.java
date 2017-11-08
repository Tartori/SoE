package Exercises.term.BetterVersionWithInheritence.test;

import Exercises.term.BetterVersionWithInheritence.Operation;
import Exercises.term.BetterVersionWithInheritence.Subtraction;
import org.junit.Assert;
import org.junit.Test;

public class SubtractionTest {
    @Test
    public void subtractPositive(){
        subtract(2,3);
    }
    @Test
    public void subtractMaxValue(){
        subtract(Integer.MAX_VALUE,2);
    }

    private void subtract(int left, int right){
        Operation operation = new Subtraction();
        Assert.assertEquals(left-right, operation.calculate(left, right));
    }
}
