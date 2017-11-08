package Exercises.term.OkVersion.test;

import Exercises.term.OkVersion.Context;
import Exercises.term.OkVersion.Term;
import Exercises.term.OkVersion.Variable;
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
