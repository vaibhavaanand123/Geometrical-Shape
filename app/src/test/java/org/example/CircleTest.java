package org.example;

import org.junit.jupiter.api.*;

import org.example.Shapes.Circle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest {

    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle();
    }

    @Test

    void checkCircleArea() {
        double radius = 4.0;
        double acceptedArea = circle.area(radius);
        double actualArea = Math.PI * radius * radius;
        Assertions.assertEquals(actualArea, acceptedArea);
    }

    

}
