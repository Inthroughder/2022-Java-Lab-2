package ru.nsu.fit.inthroughder.task1.calculator.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.nsu.fit.inthroughder.task1.calculator.context.CalcContext;

import java.util.Arrays;
import java.util.List;

public class CalcCommandDefineTest{

    @Test
    public void correct() {
        CalcContext context = new CalcContext();

        List<String> argsD = Arrays.asList("a 5".split(" "));
        CalcCommandDefine ccd = new CalcCommandDefine(context, argsD);
        ccd.execute();

        List<String> argsP = Arrays.asList("a");
        CalcCommandPush ccp = new CalcCommandPush(context, argsP);
        ccp.execute();

        Assert.assertEquals(5.0, context.getTop(), 0.01);
    }

}

