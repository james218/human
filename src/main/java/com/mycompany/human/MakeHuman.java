package com.mycompany.human;

/**
 * Hello world!
 *
 */
public class MakeHuman {


    public static void main(String[] args) {
        String name = "James";

        System.out.println("***************Creating a new human now!!*********************");

        Human human = new Human(name);
        printHumanDetails.printHumanDetails(name, human);
        

        System.out.println("You suddenly grow another arm");   
        human.setArms(3);
        
        printHumanDetails.printHumanDetails(name, human);

        System.out.println("You get a bit older" + " \n");
        human.setAge(21);

        printHumanDetails.printHumanDetails(name, human);

    }
}
