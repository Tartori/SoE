package Exercises.term.BetterVersionWithDelegation.operation;

public class Addition implements Operation {
    @Override
    public int calculate(int left, int right) {
        return left+right;
    }
}
