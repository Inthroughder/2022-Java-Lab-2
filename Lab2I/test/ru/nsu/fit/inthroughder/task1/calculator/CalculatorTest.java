package ru.nsu.fit.inthroughder.task1.calculator;

import org.junit.Test;
import ru.nsu.fit.inthroughder.task1.calculator.readers.FileCalcReader;

public class CalculatorTest {

    @Test
    public void correct (){

        FileCalcReader fileCalcReader = new FileCalcReader("C:\\Users\\v.tsarev\\IdeaProjects\\Lab2I\\Lab2I\\files\\input.txt");
        Calculator calculator = new Calculator(fileCalcReader);
        calculator.run();

    }

}