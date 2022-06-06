package app;

import java.io.Console;

public class While {

    public static void main(String[] args) {

        Console cons = System.console();
        String name = "";
        String input ="";

        while (name.length() <= 0) {
            name = cons.readLine("What is your name? ");
            name = name.trim();
        }
        System.out.printf("Hi %s, it's nice to meet you!\n", name);

        while(input.length()<=0){
        input = cons.readLine("How old are you? ");
        input = input.trim();
        }
        Integer age = Integer.parseInt(input);
        System.out.printf("You are %dyears old!\n",age);


    }

}
