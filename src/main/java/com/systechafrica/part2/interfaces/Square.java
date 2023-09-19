package com.systechafrica.part2.interfaces;

public class Square implements CalculateArea, CalculatePerimeter {

    @Override
    public double calculateArea(double length, double width) {
        return length * width;
    }

    @Override
    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

}
