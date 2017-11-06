package Exercises.term;

public final class Variable implements Term {
    private final String name;

    public Variable(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    @Override
    public int eval(Context context) {
        return context.lookup(name);
    }
}
