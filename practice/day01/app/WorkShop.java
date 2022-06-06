package app;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class WorkShop {

    public static void main(String[] args) {

        // First we make a list for our cart because we know we are making a shoppng
        // cart
        List<String> cart = new LinkedList<>();
        Console cons = System.console();
        String input;
        boolean stop = false;
        int delIndex;

        System.out.println("Welcome to your shopping cart");

        while (!stop) {
            input = cons.readLine(">");

            // next we want to read the first word for the function required to perform
            // we can use split() to do this
            String[] terms = input.split(" ");
            String cmd = terms[0];

            switch (cmd) {

                //this is to make our stop true when end is typed to exit out of the while loop
                case "end":
                stop = true;
                break;

                case "list":
                    // to get our list we can use forloop to runthrough every index of our array to
                    // print out every element stored inside.
                    if (cart.size() > 0) {
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.printf("%d.%s\n", i + 1, cart.get(i));
                        }
                    } else {
                        System.out.println("Your cart is empty");
                    }
                    break;
                
                case "add":
                    //we can use boolean to stop adding duplicate elements
                    for(int i =1; i <terms.length;i++){
                        boolean found = false;
                        for(int j =0; j < cart.size(); j++){
                            if(terms[i].equals(cart.get(j))){
                                found = true;
                    break;
                            }
                        }
                            if(!found){
                                cart.add(terms[i]);
                                System.out.printf("%s added to cart\n",terms[i]);
                            }
                 }  break;

                case "del":
                    if(terms.length < 2) {
                        System.err.println("Please provide an index to delete");
                    }else{
                        //we have to -1 because the first index we want to get is 0 instead of 1
                        delIndex = Integer.parseInt(terms[1])-1;
                        if(delIndex < cart.size()) {
                            System.out.printf("%s deleted from cart\n",cart.get(delIndex));
                            cart.remove(delIndex);
                        } else {
                            System.err.println("No such item");
                        }                       
                }   break;

                default:
                

            }
        }    System.out.println("Thank you for shopping with us !");       
    }

}
