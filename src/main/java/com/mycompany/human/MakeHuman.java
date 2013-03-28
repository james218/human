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

        System.out.println("Human details "
                + name + "\n"
                + "Their age is " + james.getAge()+ " \n"
                + "They have " + james.getArms() + " arms \n"
                + "They can say " + james.getSay() + " right now \n");

        System.out.println("You suddenly grow another arm");
        james.setArms(3);

        System.out.println("Human details "
                + name + "\n"
                + "Their age is " + james.getAge() + " \n"
                + "They have " + james.getArms() + " arms \n"
                + "They can say " + james.getSay() + " right now \n");

        System.out.println("You get a bit older" + " \n");
              
        james.setAge(21);

        System.out.println("Human details "
                + name + "\n"
                + "Their age is " + james.getAge() + " \n"
                + "They have " + james.getArms() + " arms \n"
                + "They can say " + james.getSay() + " right now \n");

    }
}
