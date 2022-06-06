package app;

public class Args {

    public static void main(String[] args) {
        
        String name = "";

        if (args.length > 0 ) 
            name = args[0];
            System.out.printf("Hello %s\n",name);
        
    }
    
}
