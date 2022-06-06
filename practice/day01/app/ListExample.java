package app;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        Console cons = System.console();
        List<String> myTodo = new LinkedList<>();
        String input = "";
        while (!"stop".equals(input)){
            input= cons.readLine("? ");
            if(!"stop".equals(input))
            myTodo.add(input);
        } System.out.println(myTodo);

        //this prints index i and element in my list at index i
        for(int i = 0; i <myTodo.size();i++){
            System.out.printf("%d: %s\n", i , myTodo.get(i));
        }

        //this prints just the elements in the list
        for(String item: myTodo) {
            System.out.printf("%s\n",item);
        }
    }
    
}
