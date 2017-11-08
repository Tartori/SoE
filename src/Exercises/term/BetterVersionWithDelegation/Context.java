package Exercises.term.BetterVersionWithDelegation;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> bindings;

    public Context(){
        bindings = new HashMap<>();
    }

    public void bind(String name, int value){
        bindings.put(name, value);
    }

    public int lookup(String name){
        if(!bindings.containsKey(name)){
            throw new IllegalArgumentException("Name "+name+" was not initialized. Should initialize first.");
        }
        return bindings.get(name);
    }
}
