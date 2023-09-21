package com.systechafrica.practiceQuestions;

public class Rope {
    public static void swing(){
        System.out.println("swing");
    }

    public void climb(){
        System.out.println("Climb");
    }

    public static void play(){
        swing();
        // create an instance of Rope to call climb()
        Rope rope = new Rope();
        rope.climb();
    }

    public static void main(String[] args) {
        // call play() statically
        Rope.play();

        // create an instance of Rope to call play()
        Rope rope2 = new Rope();
        rope2.play();
    }
}
