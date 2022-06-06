package app;

import java.io.Console;

public class Statement {

    public static void main(String[] args) {
        
    

    Console cons = System.console();
    String name = cons.readLine("What is your name?! ");

    if ( name.length() > 5 ) {

        System.out.printf("Hi %s, you have a long name!",name);
    } else {
        System.out.printf("Hi %s, you have a short name!",name);
    }

}

    
}
