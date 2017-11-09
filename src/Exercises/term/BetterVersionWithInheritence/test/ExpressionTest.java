package Exercises.term.BetterVersionWithInheritence.test;


import Exercises.term.BetterVersionWithInheritence.Constant;
import Exercises.term.BetterVersionWithInheritence.Context;
import Exercises.term.BetterVersionWithInheritence.Term;
import Exercises.term.BetterVersionWithInheritence.Variable;
import Exercises.term.BetterVersionWithInheritence.test.expression.MockExpression;
import org.junit.Assert;
import org.junit.Test;

public class ExpressionTest {
    @Test
    public void addTwoVariables(){
        int leftValue = 5;
        int rightValue = 6;
        int expected = 5+6;
        String leftVariable = "left";
        String rightVariable = "right";
        Term left = new Variable(leftVariable);
        Term right = new Variable(rightVariable);
        Term expression = new MockExpression(left, right);
        Context context = new Context();
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
        int expected2 = 5+6;
        int expected = expected1+expected2;
        Term expression1=generateExpressionWithTwoConstants(leftValue1, rightValue1);
        Term expression2=generateExpressionWithTwoConstants(leftValue2, rightValue2);
        Term expression = new MockExpression(expression1, expression2);
        Assert.assertEquals(expected, expression.eval(new Context()));

    }

    private Term generateExpressionWithTwoConstants(int leftValue, int rightValue){
        Term left = new Constant(leftValue);
        Term right = new Constant(rightValue);
        return new MockExpression(left, right);
    }
}
