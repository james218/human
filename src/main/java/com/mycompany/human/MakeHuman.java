package com.mycompany.human;

/**
 * Hello world!
 *
 */
public class MakeHuman {


    public static void main(String[] args) {
        String name = "James";

        System.out.println("***************Creating a new human now!!*********************");

        Human james = new Human();
        printHumanDetails.printHumanDetails(name, james);
        

        System.out.println("You suddenly grow another arm");   
        james.setArms(3);
        
        printHumanDetails.printHumanDetails(name, james);

        System.out.println("You get a bit older" + " \n");
        james.setAge(21);

        printHumanDetails.printHumanDetails(name, james);

    }
}
