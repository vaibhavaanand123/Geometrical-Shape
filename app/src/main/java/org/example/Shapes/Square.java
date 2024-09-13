package org.example.Shapes;

import org.example.Interface.Method;

public class Square implements Method {

   double area = 0;
   double perimeter  = 1;
    public void area(double side) {
            area=side*side;
    }

    public void perimeter (double side) {
        perimeter = 4*side; 
}

    @Override
    public void message() {
    System.out.println("Area of Square :" + area);
    System.out.println("Perimeter of Square :" + perimeter);
    }

    
    
}
