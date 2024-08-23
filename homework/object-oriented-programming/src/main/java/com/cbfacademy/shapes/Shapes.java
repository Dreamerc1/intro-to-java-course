package com.cbfacademy.shapes;

import java.util.ArrayList;
import java.util.List;

public class Shapes {

    public static double computeArea(List<Enclosure> enclosures) {
        double totalArea = 0;
        for (Enclosure enclosure : enclosures) {
            totalArea += enclosure.area();
        }
        return totalArea;
    }

    public static double computePerimeter(List<Enclosure> enclosures) {
        double totalPerimeter = 0;
        for (Enclosure enclosure : enclosures) {
            totalPerimeter += enclosure.perimeter();
        }
        return totalPerimeter;
    }

    public static void main(String[] args) {
        // Creating instances of Square and Circle
        Square square1 = new Square(20);
        Square square2 = new Square(4);
        Square square3 = new Square(12);
        Circle circle1 = new Circle(15);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(5);

        // Adding them to a list of Enclosure
        List<Enclosure> enclosures = new ArrayList<>();
        enclosures.add(square1);
        enclosures.add(square2);
        enclosures.add(square3);
        enclosures.add(circle1);
        enclosures.add(circle2);
        enclosures.add(circle3);

        // Computing and displaying the total area and perimeter
        double totalArea = computeArea(enclosures);
        double totalPerimeter = computePerimeter(enclosures);

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}

