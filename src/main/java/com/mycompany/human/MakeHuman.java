package com.mycompany.human;

/**
 * Hello world!
 *
 */
public class MakeHuman {

    public static void printHumanDetails(String name, Human in) {
        System.out.println("Human details "
                + name + "\n"
                + "Their age is " + in.getAge() + " \n"
                + "They have " + in.getArms() + " arms \n"
                + "They can say " + in.getSay() + " right now \n");
    }

    public static void main(String[] args) {
        String name = "James";

        System.out.println("***************Creating a new human now!!*********************");

        Human james = new Human();

        printHumanDetails(name, james);

        System.out.println("You suddenly grow another arm");
        
        james.setArms(3);

        printHumanDetails(name, james);

        System.out.println("You get a bit older" + " \n");

        james.setAge(21);

        printHumanDetails(name, james);

    }
}
