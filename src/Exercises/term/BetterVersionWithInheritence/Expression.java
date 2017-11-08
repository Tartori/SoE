package Exercises.term.BetterVersionWithInheritence;

public abstract class Expression implements Term {
    private final Term left;
    private final Term right;

    protected Expression(Term left, Term right) {
        this.left = left;
        this.right = right;
    }

    protected Term getLeft(){
        return left;
    }

    protected Term getRight(){
        return right;
    }

    @Override
    public abstract int eval(Context ctx);
}
