package app;

import java.io.Console;

public class Example {

    public static void main(String[] args) {
        Console cons = System.console();
        String input = cons.readLine("What is your hobby? ");
        input = input.trim();
    
        if(input.equalsIgnoreCase("swim")) {

            System.out.printf("I love to %s too\n" , input);
        } else if (input.equalsIgnoreCase("jog")) {
            System.out.printf("I hate %sing!\n",input);
        } else if (input.equalsIgnoreCase("codding")){
            System.out.println("I am also learning how to code!");
        } else {

            System.out.printf("I have not heard of this %s before\n",input);
        }
    
    }
    
}
