package Exercises.term.BetterVersionWithDelegation.test;

import Exercises.term.BetterVersionWithDelegation.Context;
import Exercises.term.BetterVersionWithDelegation.Term;
import Exercises.term.BetterVersionWithDelegation.Variable;
import org.junit.Assert;
import org.junit.Test;

public class VariableTest {
    @Test
    public void testVariableXEquals5(){
        Context context = new Context();
        int expected = 5;
        String name = "x";
        context.bind(name, expected);
        Term t = new Variable(name);
        int actual = t.eval(context);
        Assert.assertEquals(expected, actual);
    }
}
