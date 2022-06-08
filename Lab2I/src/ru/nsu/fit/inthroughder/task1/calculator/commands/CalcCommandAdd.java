package ru.nsu.fit.inthroughder.task1.calculator.commands;

import ru.nsu.fit.inthroughder.task1.calculator.context.CalcContext;
import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcNotEnoughArgsException;

public class CalcCommandAdd implements CalcCommand{

    private final CalcContext context;

    public CalcCommandAdd(CalcContext context){

        this.context = context;

    }

    @Override
    public void execute(){

        if (context.stackSize() < 2){
            throw new CalcNotEnoughArgsException();
        }

        Double a = context.pop();
        Double b = context.pop();
        context.push(a + b);
    }

}
