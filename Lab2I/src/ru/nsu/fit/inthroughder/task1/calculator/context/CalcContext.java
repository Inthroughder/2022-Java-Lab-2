package ru.nsu.fit.inthroughder.task1.calculator.context;

import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcNoSuchVariableException;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalcContext {

    private final List<Double> stack = new LinkedList<>();
    private final Map<String, Double> currentVariables = new HashMap<>();

    //stack:

    public Double getTop() {
        return stack.get(0);
    }

    public void push(Double a){
        stack.add(0, a);
    }

    public Double pop(){
        Double top = getTop();
        stack.remove(0);
        return top;
    }

    public int stackSize(){
        return stack.size();
    }

    //variables:

    public void addVariableValue(String name, Double value){
        currentVariables.put(name, value);
    }

    public Double getVariableValue(String name) throws CalcNoSuchVariableException {
        Double value = currentVariables.get(name);
        if (value == null){
            throw new CalcNoSuchVariableException("No such variable");
        } else {
            return value;
        }
    }

}
