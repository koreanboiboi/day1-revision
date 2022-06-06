package app;

import java.io.*;

public class Greetings {

    public static void main(String[] args) {
        
        Console cons = System.console();
        String name = cons.readLine("What is your name? ");
        System.out.printf("Hello %s, nice to meet you!\n", name );

        System.out.printf("");

    }
    
}
