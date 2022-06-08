package ru.nsu.fit.inthroughder.task1.calculator.commands;

import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcException;

public interface CalcCommand {

    void execute() throws CalcException;

}
