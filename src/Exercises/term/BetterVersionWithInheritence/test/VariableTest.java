package Exercises.term.BetterVersionWithInheritence.test;

import Exercises.term.BetterVersionWithInheritence.Context;
import Exercises.term.BetterVersionWithInheritence.Term;
import Exercises.term.BetterVersionWithInheritence.Variable;
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
