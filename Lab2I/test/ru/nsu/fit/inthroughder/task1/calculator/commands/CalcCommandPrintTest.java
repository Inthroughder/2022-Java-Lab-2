package ru.nsu.fit.inthroughder.task1.calculator.commands;

import org.junit.Test;
import ru.nsu.fit.inthroughder.task1.calculator.context.CalcContext;


public class CalcCommandPrintTest {

    @Test
    public void correct() {

        CalcContext context = new CalcContext();
        context.push(7.0);

        CalcCommandPrint ccp = new CalcCommandPrint(context);
        ccp.execute();

    }

}
