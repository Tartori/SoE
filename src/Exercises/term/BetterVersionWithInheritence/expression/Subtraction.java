package Exercises.term.BetterVersionWithInheritence.expression;

import Exercises.term.BetterVersionWithInheritence.Context;
import Exercises.term.BetterVersionWithInheritence.Expression;
import Exercises.term.BetterVersionWithInheritence.Term;

public class Subtraction extends Expression {

    public Subtraction(Term left, Term right) {
        super(left, right);
    }

    @Override
    public int eval(Context ctx) {
        return getLeft().eval(ctx)-getRight().eval(ctx);
    }
}
