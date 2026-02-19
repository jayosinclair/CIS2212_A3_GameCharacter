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

        inst1.setName("Charlie");
        inst1.setLevel(0);
        inst1.setExpPtsCurrent(0);
        inst1.setNextLvlExpPts(50);
        inst1.setDefense(15);
        inst1.setAttackVanilla(20);
        inst1.setAttackSpecial(35);
        inst1.setHealthCurrent(100);
        inst1.setHealthCapacity(100);
        inst1.setMagicCurrent(15);
        inst1.setMagicCapacity(15);
        inst1.setLuck(false); 


        //To test Character class... these are accessors:
        System.out.println(inst1.getName());
        System.out.println(inst1.getLevel());
        System.out.println(inst1.getExpPtsCurrent());
        System.out.println(inst1.getNextLvlExpPts());
        System.out.println(inst1.getDefense());
        System.out.println(inst1.getAttackVanilla());
        System.out.println(inst1.getAttackSpecial());
        System.out.println(inst1.getHealthCurrent());
        System.out.println(inst1.getHealthCapacity());
        System.out.println(inst1.getMagicCurrent());
        System.out.println(inst1.getMagicCapacity());
        System.out.println(inst1.getLuck());
        System.out.println(inst1.toString());

        Character inst2 = new Character("Rocky", 0,0, 50,20,22,35,95,95,10,10,false);

        System.out.println(inst2.getName());
        System.out.println(inst2.getLevel());
        System.out.println(inst2.getExpPtsCurrent());
        System.out.println(inst2.getNextLvlExpPts());
        System.out.println(inst2.getDefense());
        System.out.println(inst2.getAttackVanilla());
        System.out.println(inst2.getAttackSpecial());
        System.out.println(inst2.getHealthCurrent());
        System.out.println(inst2.getHealthCapacity());
        System.out.println(inst2.getMagicCurrent());
        System.out.println(inst2.getMagicCapacity());
        System.out.println(inst2.getLuck());
        System.out.println(inst2.toString());




        /*Character 1 attacks Character 2
        System.out.println("Character 1 attacks Character 2...: \n\n");

        int attack1 = inst1.attack();
        inst2.defend(attack1);

        System.out.println("Character 1:");

        System.out.println(inst1.toString());

        System.out.println("Character 2:");
        System.out.println(inst2.toString());
        */


    }

}