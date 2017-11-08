package Exercises.term.BetterVersionWithDelegation;

import Exercises.term.BetterVersionWithDelegation.operation.Operation;

public final class Expression implements Term {
    private final Term left;
    private final Term right;
    private final Operation operation;

    public Expression(Term left, Term right, Operation operation) {
        this.left = left;
        this.right = right;
        this.operation=operation;
    }


    @Override
    public int eval(Context ctx) {
        int leftValue = left.eval(ctx);
        int rightValue = right.eval(ctx);
        return operation.calculate(leftValue, rightValue);
    }
}
