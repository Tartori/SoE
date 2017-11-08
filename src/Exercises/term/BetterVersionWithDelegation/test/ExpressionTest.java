package Exercises.term.BetterVersionWithDelegation.test;

import Exercises.term.BetterVersionWithDelegation.operation.*;
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
        Exercises.term.BetterVersionWithDelegation.Term left = new Exercises.term.BetterVersionWithDelegation.Variable(leftVariable);
        Exercises.term.BetterVersionWithDelegation.Term right = new Exercises.term.BetterVersionWithDelegation.Variable(rightVariable);
        Exercises.term.BetterVersionWithDelegation.Term expression = new Exercises.term.BetterVersionWithDelegation.Expression(left, right, new Addition());
        Exercises.term.BetterVersionWithDelegation.Context context = new Exercises.term.BetterVersionWithDelegation.Context();
        context.bind(leftVariable, leftValue);
        context.bind(rightVariable, rightValue);
        Assert.assertEquals(expected, expression.eval(context));
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
        Exercises.term.BetterVersionWithDelegation.Term expression1=generateExpressionWithTwoConstants(leftValue1, rightValue1, new Addition());
        Exercises.term.BetterVersionWithDelegation.Term expression2=generateExpressionWithTwoConstants(leftValue2, rightValue2, new Subtraction());
        Exercises.term.BetterVersionWithDelegation.Term expression = new Exercises.term.BetterVersionWithDelegation.Expression(expression1, expression2, new Addition());
        Assert.assertEquals(expected, expression.eval(new Exercises.term.BetterVersionWithDelegation.Context()));

    }
    private void operateOnTwoConstants(int leftValue, int rightValue, int expected, Operation operation){
        Exercises.term.BetterVersionWithDelegation.Term expression = generateExpressionWithTwoConstants(leftValue, rightValue, operation);
        Assert.assertEquals(expected, expression.eval(new Exercises.term.BetterVersionWithDelegation.Context()));
    }

    private Exercises.term.BetterVersionWithDelegation.Term generateExpressionWithTwoConstants(int leftValue, int rightValue, Operation operation){
        Exercises.term.BetterVersionWithDelegation.Term left = new Exercises.term.BetterVersionWithDelegation.Constant(leftValue);
        Exercises.term.BetterVersionWithDelegation.Term right = new Exercises.term.BetterVersionWithDelegation.Constant(rightValue);
        return new Exercises.term.BetterVersionWithDelegation.Expression(left, right, operation);
    }
}
