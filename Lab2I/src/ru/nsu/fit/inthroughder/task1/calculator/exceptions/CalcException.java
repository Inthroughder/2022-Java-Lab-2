package ru.nsu.fit.inthroughder.task1.calculator.exceptions;

public class CalcException extends RuntimeException {

    public CalcException(Throwable e){

        super(e);

    }

    public CalcException(String message){

        super(message);

    }

}
