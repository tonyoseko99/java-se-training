package com.systechafrica.part2.staticMethodsAndClasses;

public class MathUtils {
    public static class Calculator {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static int divide(int a, int b) {
            return a / b;
        }
    }
    public static class Area{
        static int length;
        static int width;
        static int area;                    //! if you fail to declare this as static, you will get an error in the getArea method
                                            //! because you cannot access a non-static variable from a static method

        public static int getArea(int length, int width){
            Area.length = length;
            Area.width = width;
            area = length * width;
            return area;
        }

        public static int perimeter(int length, int width){
            Area.length = length;
            Area.width = width;
            return 2 * (length + width);
        }
    }
}
