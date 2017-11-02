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
    public int eval(Context ctx) {
        return 0;
                //ctx.getValueOf(name);
    }
}
