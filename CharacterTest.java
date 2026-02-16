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

public class CharacterTest{

    public static void main(String[] args) {

        Character inst1 = new Character();

        //To test Character class... these are mutators:

        inst1.setName("Char Name");
        inst1.setLevel(0);
        inst1.setExpPts(0);
        inst1.setNextLvlExpPts(0);
        inst1.setHealth(80);
        inst1.setMagic(400);
        inst1.setLuck(2); 


        //To test Character class... these are accessors:
        System.out.println(inst1.getName());
        System.out.println(inst1.getLevel());
        System.out.println(inst1.getExpPts());
        System.out.println(inst1.getNextLvlExpPts());
        System.out.println(inst1.getHealth());
        System.out.println(inst1.getMagic());
        System.out.println(inst1.getLuck());
        System.out.println(inst1.toString());

        Character inst2 = new Character("Beast", 0,0, 10, 20,7,1);

        System.out.println(inst2.getName());
        System.out.println(inst2.getLevel());
        System.out.println(inst2.getHealth());
        System.out.println(inst2.getMagic());
        System.out.println(inst2.getLuck());
        System.out.println(inst2.toString());



        
        //Character 1 attacks Character 2
        System.out.println("Character 1 attacks Character 2...: \n\n");

        int attack1 = inst1.attack();
        inst2.defend(attack1);

        System.out.println("Character 1:");

        System.out.println(inst1.toString());

        System.out.println("Character 2:");
        System.out.println(inst2.toString());


    }

}