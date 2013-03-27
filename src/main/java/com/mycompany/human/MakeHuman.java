package com.mycompany.human;

/**
 * Hello world!
 *
 */
public class MakeHuman 
{
    public static void main( String[] args )
    {
        Human james = new Human();
        System.out.println(james.getAge());
        
        james.setAge(40);
        james.educated= Boolean.TRUE;
        System.out.println(james.getAge());
        System.out.println(james.say("hi"));
    }
}
