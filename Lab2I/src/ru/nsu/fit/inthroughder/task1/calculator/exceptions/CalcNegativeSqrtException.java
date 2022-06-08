package ru.nsu.fit.inthroughder.task1.calculator.exceptions;

public class CalcNegativeSqrtException extends CalcException{

    public CalcNegativeSqrtException(){

        super("Negative number in sqrt argument");

    }

}