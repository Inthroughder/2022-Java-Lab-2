package ru.nsu.fit.inthroughder.task1.calculator.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.nsu.fit.inthroughder.task1.calculator.context.CalcContext;

public class CalcCommandDivTest{

    @Test
    public void correct() {
        CalcContext context = new CalcContext();
        context.push(3.0);
        context.push(10.0);

        CalcCommandDiv ccv = new CalcCommandDiv(context);
        ccv.execute();
        Assert.assertEquals(3.33, context.getTop(), 0.01);
    }

    @Test
    public void incorrect(){
        CalcContext context = new CalcContext();
        context.push(0.0);
        context.push(10.0);

        CalcCommandDiv ccv = new CalcCommandDiv(context);
        try {
            ccv.execute();
        } catch (Exception e){
            Assert.assertEquals("Zero division", e.getMessage());
        }

    }
}
