package org.example;

import org.example.Shapes.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SquareTest {

    private Square square;

    @BeforeEach
    void setUp(){
        square=new Square();
    }

    @Test
    void checkSquareArea(){
        double side=12;
        double acceptedResult=square.area(side);
        double actualResult=side*side;

        Assertions.assertEquals(acceptedResult, actualResult);
    }


    @Test
    void checkSquarePerimeter(){
        double side=12;
        double acceptedResult=square.perimeter(side);
        double actualResult=4*side;

        Assertions.assertEquals(acceptedResult, actualResult);
    }
    
}
