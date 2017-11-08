package Exercises.term.BetterVersionWithDelegation.operation.test;

import Exercises.term.BetterVersionWithDelegation.operation.Multiplication;
import Exercises.term.BetterVersionWithDelegation.operation.Operation;
import org.junit.Assert;
import org.junit.Test;

public class MultiplicationTest {
    @Test
    public void multiplyPositive(){
        multiply(2,3);
    }
    @Test
    public void multiplyMaxValue(){
        multiply(Integer.MAX_VALUE,2);
    }

    private void multiply(int left, int right){
        Operation operation = new Multiplication();
        Assert.assertEquals(left*right, operation.calculate(left, right));
    }
}
