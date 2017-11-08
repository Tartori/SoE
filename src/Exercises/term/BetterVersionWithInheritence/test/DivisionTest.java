package Exercises.term.BetterVersionWithInheritence.test;

import Exercises.term.BetterVersionWithInheritence.Division;
import Exercises.term.BetterVersionWithInheritence.Operation;
import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {
    @Test
    public void dividePositive(){
        divide(2,3);
}
    @Test
    public void divideMaxValue(){
        divide(Integer.MAX_VALUE,2);
    }

    private void divide(int left, int right){
        Operation operation = new Division();
        Assert.assertEquals(left/right, operation.calculate(left, right));
    }
}
