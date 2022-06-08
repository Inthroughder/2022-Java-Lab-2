package ru.nsu.fit.inthroughder.task1.calculator.commands;

import ru.nsu.fit.inthroughder.task1.calculator.context.CalcContext;
import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcEmptyStackException;

public class CalcCommandPrint implements CalcCommand{

    private final CalcContext context;

    public CalcCommandPrint(CalcContext context){

        this.context = context;

    }

    @Override
    public void execute() {

        if (context.stackSize() < 1){
            throw new CalcEmptyStackException();
        }

        System.out.println(context.getTop());

    }

}
