package ru.nsu.fit.inthroughder.task1.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.nsu.fit.inthroughder.task1.calculator.commands.CalcCommand;
import ru.nsu.fit.inthroughder.task1.calculator.commands.CalcCommandAdd;

import java.util.ArrayList;
import java.util.List;

public class CommandFactoryTest {

    @Test
    public void correct (){

        List<String> commandAndArgs = new ArrayList<>();
        commandAndArgs.add("+");

        CommandFactory factory = new CommandFactory();

        CalcCommand command = factory.getCommand(commandAndArgs);

        Assert.assertEquals(command.getClass(), CalcCommandAdd.class);

    }

}
