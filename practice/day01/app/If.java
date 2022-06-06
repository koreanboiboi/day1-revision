package app;

import java.io.Console;

public class If {

    public static void main(String[] args) {
        
        Console cons = System.console();
        String input = cons.readLine("What is your age? ");
        Integer age = Integer.parseInt(input);

        if (age <=0) {

            System.err.println("you're not even born!");
        } else if (age>0 && age < 7) {
            System.out.printf("%d years old ?! You are just a toddler!\n",age);
        } else if (age >7 && age <12) {
            System.out.printf("pfft atleast you are %d years old\n",age);
        } else if (age>= 12 && age <18) {
            System.out.println("enjoy your teen life!");
        } else {
            System.out.println("welcome to adulthood!");
        }


    }
    
}
