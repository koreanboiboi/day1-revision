package app;

import java.io.Console;

public class Switch {

    

    public static void main(String[] args) {
        Console cons = System.console();
    String input = cons.readLine("What is your hobby? ");

        switch(input.trim().toLowerCase()) {

            case "swim": 
            System.out.println("I love to swim too!");
            break;

            case "jog":
            System.out.println("I hate jogging!");
            break;

            case "run":
            System.out.println("Why do you like to run omg!");
            break;

            default:
            System.out.printf("What is this %s hobby of yours?\n",input);
        }


        
    }

    
}
