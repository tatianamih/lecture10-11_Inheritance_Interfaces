package jrr.by.bean;

import jrr.by.interfaces.MathOperation;

public class OperationExecutor {
   
    public void execute(MathOperation[] operations, double a, double b){
        for (MathOperation operation:operations) {
           String info = "MathOperations : " + operation.getClass() + " " + operation.compute(a, b);
        }
    }
}

