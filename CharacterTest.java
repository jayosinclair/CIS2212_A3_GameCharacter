/*Author: Jay Olson
Section: CIS 2212-801
Assignment: Project 3 Game Character
Due Date: February 25, 2026
Submitted: February XX, 2026
*/

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

        Character obj1 = new Character();
        Character obj2 = new Character("Rocky", 0,0, 50,20,22,35,95,95,10,10,false);

        System.out.println("\n\nBegin test stubs......\n");

        //To test Character class... these are mutators to replace default constructor values:

        obj1.setName("Charlie");
        obj1.setLevel(0);
        obj1.setExpPtsCurrent(0);
        obj1.setNextLvlExpPts(50);
        obj1.setDefense(15);
        obj1.setAttackVanilla(20);
        obj1.setAttackSpecial(35);
        obj1.setHealthCurrent(100);
        obj1.setHealthCapacity(100);
        obj1.setMagicCurrent(15);
        obj1.setMagicCapacity(15);
        obj1.setLuck(false); 


        //To test Character class... these are accessors, which print to console:
        System.out.println("Testing individual getter methods...\n");
        System.out.println("Starting values for " + obj1.getName() + ": \n");
        System.out.println(obj1.getName());
        System.out.println(obj1.getLevel());
        System.out.println(obj1.getExpPtsCurrent());
        System.out.println(obj1.getNextLvlExpPts());
        System.out.println(obj1.getDefense());
        System.out.println(obj1.getAttackVanilla());
        System.out.println(obj1.getAttackSpecial());
        System.out.println(obj1.getHealthCurrent());
        System.out.println(obj1.getHealthCapacity());
        System.out.println(obj1.getMagicCurrent());
        System.out.println(obj1.getMagicCapacity());
        System.out.println(obj1.getLuck());

        System.out.println("\n\nStarting values for " + obj2.getName() + ": \n");
        System.out.println(obj2.getName());
        System.out.println(obj2.getLevel());
        System.out.println(obj2.getExpPtsCurrent());
        System.out.println(obj2.getNextLvlExpPts());
        System.out.println(obj2.getDefense());
        System.out.println(obj2.getAttackVanilla());
        System.out.println(obj2.getAttackSpecial());
        System.out.println(obj2.getHealthCurrent());
        System.out.println(obj2.getHealthCapacity());
        System.out.println(obj2.getMagicCurrent());
        System.out.println(obj2.getMagicCapacity());
        System.out.println(obj2.getLuck());

        System.out.println("\n________________________________________________________________________");
        System.out.println("\n\nTesting toString Methods (Also Starting Values)...");
        System.out.println(obj1.toString());
        System.out.println("\n" + obj2.toString());


        //Character 1 attacks Character 2
        System.out.println("\n________________________________________________________________________");
        System.out.println("\n\nCharacter 1 (" + obj1.getName() + ") Attacks Character 2 (" + obj2.getName() + ")...: \n\n");

        int attackValue = obj1.attack();

        System.out.println(obj1.getName() + "\'s Attack Value Inflicted on " + obj2.getName() + ": " + attackValue);

        obj2.defend(attackValue);

        System.out.println(obj2.getName() + "\'s Updated Stats: ");
        System.out.println(obj2.toString());


    }

}