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

Character inst = new Character();

        //To test Character class... these are mutators:

        inst.setID(1);
        inst.setName("Char Name");
        inst.setLevel(0);
        inst.setHealth(80);
        inst.setAttack(200);
        inst.setMagic(400);
        inst.setDefense(45);
        inst.setLuck(2); 


        //To test Character class... these are accessors:
        System.out.println(inst.getID());
        System.out.println(inst.getName());
        System.out.println(inst.getLevel());
        System.out.println(inst.getHealth());
        System.out.println(inst.getAttack());
        System.out.println(inst.getMagic());
        System.out.println(inst.getDefense());
        System.out.println(inst.getLuck());
        System.out.println(inst.toString());


    }

}