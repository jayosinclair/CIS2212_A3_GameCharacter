//Author: Jay Olson
//Section: CIS 2212-801
//Assignment: Project 3 Game Character
//Due Date: February 25, 2026
//Submitted: February XX, 2026

/**
Program Purpose: Practice designing a class.

Program Function: This program designs a class for an RPG game character. The class has accessor and mutator methods along 
with a couple other methods used to manipulate character attributes and have characters take actions.

Note: CharacterTest is the wrapper class containing the main method, while the Character class has the blueprint for the 
game character's member variables and methods.

*/

//Github repo for this project is at: https://github.com/jayosinclair/CIS2212_A3_GameCharacter.git
//**********************************************************************************************************************

import java.util.Random;

public class CharacterTest{

    public static void main(String[] args) {

Random rgen = new Random();

Character inst1 = new Character();

        int randValue = rgen.nextInt(10);

        System.out.println("Random value: " + randValue);


        //To test Character class... these are mutators:

        inst1.setID(1);
        inst1.setName("Char Name");
        inst1.setLevel(0);
        inst1.setHealth(80);
        inst1.setAttack(200);
        inst1.setMagic(400);
        inst1.setDefense(45);
        inst1.setLuck(2); 


        //To test Character class... these are accessors:
        System.out.println(inst1.getID());
        System.out.println(inst1.getName());
        System.out.println(inst1.getLevel());
        System.out.println(inst1.getHealth());
        System.out.println(inst1.getAttack());
        System.out.println(inst1.getMagic());
        System.out.println(inst1.getDefense());
        System.out.println(inst1.getLuck());
        System.out.println(inst1.toString());

        Character inst2 = new Character(9, "Beast", 0,20,7,2,8,1);

        System.out.println(inst2.getID());
        System.out.println(inst2.getName());
        System.out.println(inst2.getLevel());
        System.out.println(inst2.getHealth());
        System.out.println(inst2.getAttack());
        System.out.println(inst2.getMagic());
        System.out.println(inst2.getDefense());
        System.out.println(inst2.getLuck());
        System.out.println(inst2.toString());

    }

}