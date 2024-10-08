package org.example.Implementation;

import java.util.Scanner;


import org.example.Interface.Method;
import org.example.Shapes.Circle;
import org.example.Shapes.Square;

public class CalculationCreator {

    public static Method getCalculation(int choice) {
        Scanner sc = new Scanner(System.in);
        switch (choice) {
            case 1:
                Circle cr = new Circle();
                Method.name(cr.shapeName());
                System.out.println("Enter the Radius: ");
                Double radius = sc.nextDouble();
                cr.area(radius);
                sc.close();

                return cr;
            case 2:
                Square sq = new Square();
                Method.name(sq.shapeName());
                System.out.println("Enter the Side: ");
                Double side = sc.nextDouble();
                sq.area(side);
                sq.perimeter(side);
                sc.close();

                return sq;

            default:
                sc.close();
                return null;
        }

    }

}
