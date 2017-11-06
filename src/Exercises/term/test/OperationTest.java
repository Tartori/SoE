package Exercises.term.test;

import Exercises.term.Operation;
import org.junit.Assert;
import org.junit.Test;

public class OperationTest {
    @Test
    public void addTest(){
        Operation add = Operation.Add;
        int left = 2;
        int right = 3;
        int expected = left+right;
        Assert.assertEquals(expected, add.apply(left, right));
    }
    @Test
    public void subtractTest(){
        Operation add = Operation.Subtract;
        int left = 2;
        int right = 3;
        int expected = left-right;
        Assert.assertEquals(expected, add.apply(left, right));
    }
    @Test
    public void multiplyTest(){
        Operation add = Operation.Multiply;
        int left = 2;
        int right = 3;
        int expected = left*right;
        Assert.assertEquals(expected, add.apply(left, right));
    }
    @Test
    public void divideTest(){
        Operation add = Operation.Divide;
        int left = 100;
        int right = 3;
        int expected = left/right;
        Assert.assertEquals(expected, add.apply(left, right));
    }
}
