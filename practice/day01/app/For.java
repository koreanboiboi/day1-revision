package app;

import java.io.Console;

public class For {

    public static void main(String[] args) {
        Console cons = System.console();
        String input = cons.readLine("Type phrase here: ");
        for(int i = 0; i< input.length(); i++)
        System.out.println(input.substring(0,i));
    }
    
}
