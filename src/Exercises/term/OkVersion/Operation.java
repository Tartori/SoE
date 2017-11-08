package Exercises.term.OkVersion;

public enum Operation {
    Add {
        @Override
        public int apply(int left, int right) {
            return left + right;
        }
    }, Subtract {
        @Override
        public int apply(int left, int right) {
            return left - right;
        }
    }, Divide {
        @Override
        public int apply(int left, int right) {
            return left / right;
        }
    }, Multiply {
        @Override
        public int apply(int left, int right) {
            return left * right;
        }
    };

    public abstract int apply(int left, int right);
}
