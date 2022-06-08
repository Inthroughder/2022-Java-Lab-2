package ru.nsu.fit.inthroughder.task1.calculator.commands;

import ru.nsu.fit.inthroughder.task1.calculator.context.CalcContext;

import java.util.List;

public class CalcCommandDefine implements CalcCommand{

    private final CalcContext context;
    private final String name;
    private final Double value;

    public CalcCommandDefine(CalcContext context, List<String> args){
        this.context = context;
        this.name = args.get(0);
        this.value = Double.parseDouble(args.get(1));
    }

    @Override
    public void execute(){
        context.addVariableValue(name, value);
    }

}
