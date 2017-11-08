package Exercises.term.BetterVersionWithInheritence.test;

import Exercises.term.BetterVersionWithInheritence.*;
import org.junit.Assert;
import org.junit.Test;

public class ExpressionTest {
    @Test
    public void addTwoConstants(){
        int leftValue = 5;
        int rightValue = 6;
        int expected = 5+6;
        operateOnTwoConstants(leftValue, rightValue, expected, new Addition());
    }

    @Test
    public void subtractTwoConstants(){
        int leftValue = 5;
        int rightValue = 6;
        int expected = 5-6;
        operateOnTwoConstants(leftValue, rightValue, expected, new Subtraction());
    }

    @Test
    public void multiplyTwoConstants(){
        int leftValue = 5;
        int rightValue = 6;
        int expected = 5*6;
        operateOnTwoConstants(leftValue, rightValue, expected, new Multiplication());
    }

    @Test
    public void divideTwoConstants(){
        int leftValue = 5;
        int rightValue = 6;
        int expected = 5/6;
        operateOnTwoConstants(leftValue, rightValue, expected, new Division());
    }

    @Test
    public void addTwoVariables(){
        int leftValue = 5;
        int rightValue = 6;
        int expected = 5+6;
        String leftVariable = "left";
        String rightVariable = "right";
        Term left = new Variable(leftVariable);
        Term right = new Variable(rightVariable);
        Assert.fail("not yet implemented");// Term expression = new Expression(left, right, new Addition());
        Context context = new Context();
        context.bind(leftVariable, leftValue);
        context.bind(rightVariable, rightValue);
        //Assert.assertEquals(expected, expression.eval(context));
    }

    @Test
    public void addTwoExpressions(){
        int leftValue1 = 5;
        int rightValue1 = 6;
        int expected1 = 5+6;
        int leftValue2 = 5;
        int rightValue2 = 6;
        int expected2 = 5-6;
        int expected = expected1+expected2;
        Term expression1=generateExpressionWithTwoConstants(leftValue1, rightValue1, new Addition());
        Term expression2=generateExpressionWithTwoConstants(leftValue2, rightValue2, new Subtraction());
        //Term expression = new Expression(expression1, expression2, new Addition());
        //Assert.assertEquals(expected, expression.eval(new Context()));
        Assert.fail("not yet implemented");

    }
    private void operateOnTwoConstants(int leftValue, int rightValue, int expected, Operation operation){
        Term expression = generateExpressionWithTwoConstants(leftValue, rightValue, operation);
        Assert.assertEquals(expected, expression.eval(new Context()));
    }

    private Term generateExpressionWithTwoConstants(int leftValue, int rightValue, Operation operation){
        Term left = new Constant(leftValue);
        Term right = new Constant(rightValue);
        Assert.fail("not yet implemented");
        //return new Expression(left, right, operation);
        return null;
    }
}
