package Exercises.term.BetterVersionWithDelegation.test;

import Exercises.term.BetterVersionWithDelegation.Context;
import org.junit.Assert;
import org.junit.Test;

public class ContextTest {

    @Test
    public void addVariableWithEmptyName(){
        addVariable("",5);
    }

    @Test
    public void addVariableWithLongName(){
        addVariable("RidiculouslyLongNameBecauseWeNeedToTestItForSomeStrangePeople",5);
    }

    @Test
    public void addVariableXEquals5(){
        addVariable("x",5);
    }

    @Test
    public void addVariableXEqualsNegative2(){
        addVariable("x",-2);
    }

    @Test
    public void addVariableXEqualsZero(){
        addVariable("x",0);
    }

    @Test
    public void addVariableXEqualsMinValue(){
        addVariable("x",Integer.MIN_VALUE);
    }

    @Test
    public void addVariableXEqualsMaxValue(){
        addVariable("x",Integer.MAX_VALUE);
    }

    private void addVariable(String variable, int expected){
        Context context = new Context();
        context.bind(variable, expected);
        int actual = context.lookup(variable);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addMultipleVariable(){
        Context context = new Context();
        String xVariable = "x";
        int xExpected = 5;
        String yVariable = "y";
        int yExpected = -2;
        context.bind(xVariable , xExpected );
        context.bind(yVariable , yExpected);
        int xActual = context.lookup(xVariable );
        int yActual = context.lookup(yVariable);
        Assert.assertEquals(xExpected , xActual);
        Assert.assertEquals(yExpected , yActual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getUninitializedVariable(){
        Context context = new Context();
        String variable = "x";
        context.lookup(variable);
        Assert.fail("should have gotten a IllegalArgumentException§");
    }
}
