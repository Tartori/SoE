package Exercises.term.BetterVersionWithDelegation;

public final class Constant implements Term {
    private final int value;

    public Constant(int value){
        this.value=value;
    }

    @Override
    public int eval(Context ctx) {
        return value;
    }
}
