package Exercises.term.test;

import Exercises.term.Context;
import org.junit.Assert;
import org.junit.Test;

public class ContextTest {
    @Test
    public void addVariable(){
        Context context = new Context();
        String variable = "x";
        int expected = 5;
        context.bind(variable, expected);
        int actual = context.lookup(variable);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getUninitializedVariable(){
        Context context = new Context();
        String variable = "x";
        context.lookup(variable);
        Assert.fail("should have gotten a IllegalArgumentException");
    }

}
