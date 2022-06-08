package ru.nsu.fit.inthroughder.task1.calculator.commands;

import ru.nsu.fit.inthroughder.task1.calculator.context.CalcContext;
import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcException;
import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcNotEnoughArgsException;

public class CalcCommandSub implements CalcCommand{

    private final CalcContext context;

    public CalcCommandSub(CalcContext context){
        this.context = context;
    }

    @Override
    public void execute() throws CalcException {

        if (context.stackSize() < 2){
            throw new CalcNotEnoughArgsException();
        }

        Double a = context.pop();
        Double b = context.pop();
        context.push(a - b);
    }

}