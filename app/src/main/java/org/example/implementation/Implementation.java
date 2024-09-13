package org.example.implementation;


import org.example.Interface.Method;

public class Implementation {
    

    public void calculate(int choice){
    
        Method method= CalculationCreator.getCalculation(choice);

        try {
            method.message();
        } catch (Exception e) {
            System.err.println("Enter correct choice");
        }
        
    }
        
    }

