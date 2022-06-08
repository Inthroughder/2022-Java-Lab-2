package ru.nsu.fit.inthroughder.task1.calculator.commands;

import ru.nsu.fit.inthroughder.task1.calculator.context.CalcContext;
import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcZeroDivisionException;
import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcNotEnoughArgsException;

public class CalcCommandDiv implements CalcCommand{

    private final CalcContext context;

    public CalcCommandDiv(CalcContext context){
        this.context = context;
    }

    @Override
    public void execute() {

        if (context.stackSize() < 2){
            throw new CalcNotEnoughArgsException();
        }

        Double a = context.pop();
        Double b = context.pop();
        if (b == 0.0) {
            throw new CalcZeroDivisionException();
        }
        context.push(a / b);
    }

}
