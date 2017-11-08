package Exercises.term.BetterVersionWithDelegation.operation;

public class Multiplication implements Operation{
    @Override
    public int calculate(int left, int right) {
        return left*right;
    }
}
