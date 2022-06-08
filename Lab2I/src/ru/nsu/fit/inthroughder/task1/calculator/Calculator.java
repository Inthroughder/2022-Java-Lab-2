package ru.nsu.fit.inthroughder.task1.calculator;


import ru.nsu.fit.inthroughder.task1.calculator.commands.CalcCommand;
import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcException;
import ru.nsu.fit.inthroughder.task1.calculator.readers.CalcReader;

import java.util.Arrays;
import java.util.List;

public class Calculator {

    private final CalcReader reader;
    private final CommandFactory factory;

    public Calculator(CalcReader reader){

        this.reader = reader;
        this.factory = new CommandFactory();

    }

    public void run(){

        String currentLine;

        while( true ){

            currentLine = reader.getLine();

            if (currentLine.equals("EXIT")) break;
            if (currentLine.charAt(0) == '#') continue;

            List<String> commandAndArgs = Arrays.asList(currentLine.split(" "));

            try {
                CalcCommand command = factory.getCommand(commandAndArgs);
                command.execute();
            } catch (CalcException ce){
                System.out.println(ce.getMessage());
            }

        }

    }

}
