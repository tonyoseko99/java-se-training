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
        static int length = 5;
        static int width = 10;
        static int area = length * width;   //! if you fail to declare this as static, you will get an error in the getArea method
                                            //! because you cannot access a non-static variable from a static method

        public static int getArea(){
            return area;
        }
    }
}
