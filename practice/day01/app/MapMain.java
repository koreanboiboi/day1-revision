package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapMain {

    public static void main(String[] args) {
        Map<String, String> todos = new HashMap<>();
        String day ="";
        String todo = "";

        Scanner scan = new Scanner(System.in);


        while(!"stop".equals(day)){
            day = scan.next().toLowerCase();
            todo = scan.nextLine().trim();

            if("stop".equals(day))
            break;

            todos.put(day, todo);
            System.out.println(todos);
            
          //  for(String i: todos.keySet())
        //System.out.printf("%s: %s\n", i,todos.get(day));
        }

        

        
    }
    
}
