/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.human;

/**
 *
 * @author james
 */
public class printHumanDetails {
    
        public static void printHumanDetails(String name, Human in) {
        System.out.println("Human details "
                + name + "\n"
                + "Their age is " + in.getAge() + " \n"
                + "They have " + in.getArms() + " arms \n"
                + "They can say " + in.getSay() + " right now \n");
    }

}
