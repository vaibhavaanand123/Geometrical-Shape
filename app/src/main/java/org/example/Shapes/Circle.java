package org.example.Shapes;

import org.example.Interface.Method;

public class Circle implements Method {
    
    
    double area=0;
    double circumference=0;
    double diameter=0;

    public double area(double radius){
        area=Math.PI*radius*radius;
        return Math.PI*radius*radius;
    }

    @Override
    public void message() {
        System.out.println("Area of Circle: "+ area);
    }

    @Override
    public String shapeName() {
        return "Circle";
    }
    
}
