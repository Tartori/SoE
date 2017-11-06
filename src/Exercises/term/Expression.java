package Exercises.term;

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
        int ret = 0;
        int leftValue = left.eval(ctx);
        int rightValue = right.eval(ctx);
        switch (operation) {
            case Add:
                ret = leftValue + rightValue;
                break;
            case Divide:
                ret = leftValue / rightValue;
                break;
            case Multiply:
                ret = leftValue * rightValue;
                break;
            case Subtract:
                ret = leftValue - rightValue;
                break;
        }
        return ret;
    }
}
