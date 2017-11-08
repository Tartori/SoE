package Exercises.term.BetterVersionWithInheritence;

public class Multiplication implements Operation {
    @Override
    public int calculate(int left, int right) {
        return left*right;
    }
}
