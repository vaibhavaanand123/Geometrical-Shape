package org.example.Shapes;

import org.example.Interface.Method;

public class Square implements Method {
    double side=0;
    double area = 0;
    double perimeter = 1;

    public double area(double side) {
        this.side=side;
        area = side * side;
        return side * side;
    }

    public double perimeter(double side) {
        perimeter = 4 * side;
        return 4 * side;
    }

    @Override
    public void message() {
        System.out.println("(Formula of Area of "+shapeName()+") = "+"(Side X Side)"+" ("+side+" X "+side+")");
        System.out.println("Area of Square :" + area);
        System.out.println();
        System.out.println("(Formula of Perimeter of "+shapeName()+") = "+"(4 X Side)"+" ("+4+" X "+side+")");
        System.out.println("Perimeter of Square :" + perimeter);
        System.out.println();
    }

    @Override
    public String shapeName() {
        return "Square";
    }

}
