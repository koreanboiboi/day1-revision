package app;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String one = scan.next(); // reads the first word or arguments
        String two = scan.nextLine();// reads the entire line 

        System.out.printf("First args %s, Second args %s",one,two);
    }
}
