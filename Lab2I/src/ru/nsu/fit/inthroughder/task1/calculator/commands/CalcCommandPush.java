package ru.nsu.fit.inthroughder.task1.calculator.commands;

import ru.nsu.fit.inthroughder.task1.calculator.Utilities;
import ru.nsu.fit.inthroughder.task1.calculator.context.CalcContext;

import java.util.List;

public class CalcCommandPush implements CalcCommand{

    private final CalcContext context;
    private final Double value;

    public CalcCommandPush(CalcContext context, List<String> args){
        this.context = context;
        if (Utilities.isNumeric(args.get(0))){
            value = Double.parseDouble(args.get(0));
        } else {
            value = context.getVariableValue(args.get(0));
        }
    }

    public void execute(){
        context.push(value);
    }

}
