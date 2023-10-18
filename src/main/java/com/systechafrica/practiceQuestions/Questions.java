package com.systechafrica.practiceQuestions;

import java.util.ArrayList;
import java.util.List;

public class Questions {

    public void question1() {
        StringBuilder sb = new StringBuilder(5);
        System.out.println(sb.toString());
        String s = "";
        if(sb.equals(s)){
            System.out.println("Match 1");
        } else if (sb.toString().equals(s.toString())){
            System.out.println("match 2");
        } else {
            System.out.println("No match");
        }
    }

    public void question2(){
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < 5; i+=2){
            System.out.println(arr[i] + " ");
        }
    }

    public void question3(){
        int num = 5;
        do{
            System.out.println(num-- + " ");
        } while (num == 0);
    }

    public static void sum (Integer a, Integer b){
        System.out.println("Integer sum is " + (a + b));
    }
    public static void main(String[] args) {
        double num = 5;
        System.out.println(num);
        System.out.println("5 + 2 = " + (3 + 4));
        // Questions q1 = new Questions();
        // q1.question1();

        // Questions q2 = new Questions();
        // q2.question2();

        // Questions q3 = new Questions();
        // q3.question3();

        Questions.sum(1,2);

    }
}
