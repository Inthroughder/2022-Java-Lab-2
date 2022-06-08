package ru.nsu.fit.inthroughder.task1.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.nsu.fit.inthroughder.task1.calculator.context.CalcContext;

public class CalcContextTest {

    @Test
    public void correct (){

        CalcContext calcContext = new CalcContext();
        calcContext.push(5.0);
        calcContext.push(4.5);
        Assert.assertEquals(4.5, calcContext.pop(), 0.01);
        Assert.assertEquals(5.0, calcContext.getTop(), 0.01);

    }

}

