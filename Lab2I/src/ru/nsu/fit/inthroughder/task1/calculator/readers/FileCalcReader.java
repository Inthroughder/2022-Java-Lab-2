package ru.nsu.fit.inthroughder.task1.calculator.readers;


import ru.nsu.fit.inthroughder.task1.calculator.exceptions.CalcFileReadingException;

import java.io.FileInputStream;
import java.util.Scanner;


public class FileCalcReader implements CalcReader {

    private final Scanner scanner;

    public FileCalcReader(String fileName){

        try {
            scanner = new Scanner(new FileInputStream(fileName));
        } catch (Exception e) {
            throw new CalcFileReadingException(e);
        }

    }

    @Override
    public String getLine() {

        try {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                return "EXIT";
            }
        } catch (CalcFileReadingException e) {
            throw new CalcFileReadingException(e);
        }

    }

}
