package ru.nsu.fit.inthroughder.task1.calculator;

import ru.nsu.fit.inthroughder.task1.calculator.context.CalcContext;
import ru.nsu.fit.inthroughder.task1.calculator.commands.CalcCommand;
import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcException;

import java.io.InputStream;

import java.io.IOException;

import java.lang.reflect.Constructor;
import java.util.*;

public class CommandFactory {

    private final Map<String, Class<CalcCommand>> strToClass = new HashMap<>();
    private final CalcContext context = new CalcContext();

    public CommandFactory(){

        try {
            InputStream in = this.getClass().getResourceAsStream("properties.txt");
            Properties properties = new Properties();
            properties.load(in);
            for (String key : properties.stringPropertyNames()) {
                strToClass.put(key, (Class<CalcCommand>) Class.forName(properties.getProperty(key)));
            }

        } catch (IOException | ClassNotFoundException e){
            throw new CalcException(e);
        }
    }

    public CalcCommand getCommand(List<String> commandAndArgs){

        try {
            Class<CalcCommand> c = this.strToClass.get(commandAndArgs.get(0));
            if (commandAndArgs.size() == 1) {
                Constructor<CalcCommand> co = c.getConstructor(CalcContext.class);
                return co.newInstance(context);
            } else {
                Constructor<CalcCommand> co = c.getConstructor(CalcContext.class, List.class);
                return co.newInstance(context, commandAndArgs.subList(1, commandAndArgs.size()));
            }
        } catch (Exception e) {
            throw new CalcException(e);
        }

    }

}
