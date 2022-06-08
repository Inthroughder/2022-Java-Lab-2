package ru.nsu.fit.inthroughder.task1.calculator.commands;

import ru.nsu.fit.inthroughder.task1.calculator.context.CalcContext;
import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcNegativeSqrtException;
import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcNotEnoughArgsException;

import static java.lang.Math.sqrt;

public class CalcCommandSqrt implements CalcCommand{

    private final CalcContext context;

    public CalcCommandSqrt(CalcContext context){
        this.context = context;
    }

    @Override
    public void execute() {

        if (context.stackSize() < 1){
            throw new CalcNotEnoughArgsException();
        }
        if (context.getTop() < 0.0){
            throw new CalcNegativeSqrtException();
        }
        Double a = context.pop();
        context.push(sqrt(a));
    }

}
