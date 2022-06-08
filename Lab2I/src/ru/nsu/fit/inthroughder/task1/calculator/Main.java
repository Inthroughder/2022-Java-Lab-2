package ru.nsu.fit.inthroughder.task1.calculator;

import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcException;
import ru.nsu.fit.inthroughder.task1.calculator.readers.ConsoleCalcReader;
import ru.nsu.fit.inthroughder.task1.calculator.readers.FileCalcReader;
import ru.nsu.fit.inthroughder.task1.calculator.readers.CalcReader;

public class Main {

    public static void main(String[] args){
        CalcReader reader;
        if (args.length > 0) {
            reader = new FileCalcReader(args[0]);
        } else {
            reader = new ConsoleCalcReader();
        }

        try {
            Calculator calc = new Calculator(reader);
            calc.run();
        } catch (CalcException ce){
            System.out.println(ce.getMessage());
        }

    }

}
