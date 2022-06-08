package ru.nsu.fit.inthroughder.task1.calculator.readers;

import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcConsoleReadingException;

import java.util.Scanner;

public class ConsoleCalcReader implements CalcReader {

    private final Scanner scanner;
    public ConsoleCalcReader(){

        try {
            scanner = new Scanner(System.in);
        } catch (Exception e) {
            throw new CalcConsoleReadingException(e);
        }

    }

    @Override
    public String getLine() {

        try {
            return scanner.nextLine();
        } catch (CalcConsoleReadingException e) {
            throw new CalcConsoleReadingException(e);
        }

    }

}
