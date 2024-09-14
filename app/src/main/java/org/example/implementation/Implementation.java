package org.example.Implementation;

import org.example.Interface.Method;

public class Implementation {

    public void calculate(int choice) {

        Method method = CalculationCreator.getCalculation(choice);

        try {
            method.message();
            Method.more();

        } catch (Exception e) {
            System.err.println("Enter correct choice");
        }

    }

}
