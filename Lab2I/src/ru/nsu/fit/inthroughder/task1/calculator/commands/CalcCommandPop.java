package ru.nsu.fit.inthroughder.task1.calculator.commands;

import ru.nsu.fit.inthroughder.task1.calculator.context.CalcContext;
import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcEmptyStackException;

public class CalcCommandPop implements CalcCommand{

    private final CalcContext context;

    public CalcCommandPop(CalcContext context){
        this.context = context;
    }

    public void execute(){

        if (context.stackSize() < 1){
            throw new CalcEmptyStackException();
        }

        context.pop();

    }

}