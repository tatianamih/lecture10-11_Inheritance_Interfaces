package jrr.by.service;

import jrr.by.bean.*;
import jrr.by.interfaces.MathOperation;

public class MathOperationDemo {
    public static void main(String[] args) {

        MathOperation[] operations = new MathOperation[]{
                new AdditionOperation(),
                new DivisionOperation(),
                new MultiplicationOperation(),
                new RemainderOperation(),
                new SubtractionOperation(),
        };
        OperationExecutor executor = new OperationExecutor();
        executor.execute(operations, 50000, 60000);
    }
}
