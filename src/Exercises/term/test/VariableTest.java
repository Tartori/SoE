package Exercises.term.test;

import Exercises.term.Context;
import Exercises.term.Term;
import Exercises.term.Variable;
import org.junit.Assert;
import org.junit.Test;

public class VariableTest {
    @Test
    public void testVariableX(){
        Context context = new Context();

        //todo fill context with x=5
        String name = "x";
        Term t = new Variable(name);
        int actual = t.eval(context);
        Assert.assertEquals(5, actual);

    }
}
