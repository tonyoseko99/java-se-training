package com.systechafrica.practiceQuestions;

public class Questions {
    public static void main(String[] args) {
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
}
