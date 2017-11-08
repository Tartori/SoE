package Exercises.term.BetterVersionWithDelegation.operation.test;

import Exercises.term.BetterVersionWithDelegation.operation.Addition;
import Exercises.term.BetterVersionWithDelegation.operation.Operation;
import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
    @Test
    public void addPositive(){
        add(2,3);
    }
    @Test
    public void addMaxValue(){
        add(2,Integer.MAX_VALUE);
    }

    private void add(int left, int right){
        Operation operation = new Addition();
        Assert.assertEquals(left+right, operation.calculate(left, right));
    }
}
