/*Author: Jay Olson
Section: CIS 2212-801
Assignment: Project 3 Game Character
Due Date: February 25, 2026
Submitted: February 21, 2026
*/

/**
Program Purpose: Practice designing a class.

Program Function: This program designs a class for an RPG game character. The class has accessor and mutator methods along 
with a couple other methods used to manipulate character attributes and have characters take actions.

Note: CharacterTest is the wrapper class containing the main method, while the Character class has the blueprint for the 
game character's member variables and methods. The CharacterTest is not an actual game, but rather it has many stub tests
for the Character class. Getters and setters are tested with individual println statements. Two different constructors (one with and one without
arguments) are tested. Individual println statements are used extensively to show contents of instance variables. Snippets of functionality are tested
first with some hard-coded attacks and later with a while loop that runes until two of the three characters instantiated die/fall.

*/

//Github repo for this project is at: https://github.com/jayosinclair/CIS2212_A3_GameCharacter.git
//**********************************************************************************************************************

public class CharacterTest{

    public static void main(String[] args) {

        Character obj1 = new Character();
        Character obj2 = new Character("Rocky", 0,0, 50,20,22,35,95,95,10,10,false);
        Character obj3 = new Character("Charlie", 49,7992, 8000,9999,7777,9997,9995,9995,700,700,true);

        System.out.println("\n\nBegin test stubs......\n");

        //To test Character class... these are mutators to replace default constructor values:

        obj1.setName("Grande");
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
        System.out.println("\n\nCharacter 1 (" + obj1.getName() + ") Attacks Character 2 (" + obj2.getName() + "): \n\n");

        int attackValue = obj1.attack();

        System.out.println(obj1.getName() + "\'s Attack Value Inflicted on " + obj2.getName() + ": " + attackValue);

        obj2.defend(attackValue);

        System.out.println(obj2.getName() + "\'s Updated Stats: ");
        System.out.println(obj2.toString());

        attackValue = -1; //Reset attackValue in main method for testing


        //Character 2 attacks Character 1
        System.out.println("\n________________________________________________________________________");
        System.out.println("\n\nCharacter 2 (" + obj2.getName() + ") Attacks Character 1 (" + obj1.getName() + ") Using Special Attack: \n\n");

        attackValue = obj2.attackSpecial();

        System.out.println(obj2.getName() + "\'s Attack Value Inflicted on " + obj1.getName() + ": " + attackValue);

        obj1.defend(attackValue);
        System.out.println(obj1.getName() + "\'s Updated Stats: ");
        System.out.println(obj1.toString());


        System.out.println("\n" + obj2.getName() + "\'s Updated Stats (Magic was Depleted): ");
        System.out.println(obj2.toString());

        attackValue = -1; //Reset attackValue in main method for testing

        System.out.println("\n________________________________________________________________________");
        System.out.println("\n" + obj3.getName() + " Enters As a New Challenger to test exp pts and level up (with magic cap increase). " + obj3.getName() + " Stats: ");
        System.out.println(obj3.toString());



        //Character 3 attacks Character 1
        System.out.println("\n________________________________________________________________________");
        System.out.println("\n\nCharacter 3 (" + obj3.getName() + ") Attacks Character 1 (" + obj1.getName() + "): \n\n");

        attackValue = obj3.attack();

        System.out.println(obj3.getName() + "\'s Attack Value Inflicted on " + obj1.getName() + ": " + attackValue);

        obj1.defend(attackValue);
        attackValue = -1; //Reset attackValue in main method for testing
        System.out.println(obj1.getName() + "\'s Updated Stats: ");
        System.out.println(obj1.toString());

        if (obj1.getHealthCurrent() <= 0){
            System.out.println("\n\n" + obj1.getName() + " has fallen."); //Obj1 character dies
            obj3.setExpPtsCurrent(obj3.getExpPtsCurrent() + 10); //Obj2 (attacker in this case) gets experience points from Obj1's death

            if (obj3.getExpPtsCurrent() > obj3.getNextLvlExpPts()){
                System.out.println(obj3.getName() + " Level Up!");
                obj3.levelUp();
            }

        }


        //Grande (obj1) is undoubtedly dead at this point. Have Charlie (obj3) and Rocky (obj2) fight it out until someone loses. If Rocky is already dead, don't execute the while loop at all.

        System.out.println("\n________________________________________________________________________");
        System.out.println("More Moves (If More Than 2 Characters Still Alive):");

        while (obj2.getHealthCurrent() > 0 && obj3.getHealthCurrent() > 0){

            attackValue = obj2.attack();
            System.out.println(obj2.getName() + " Attacked " + obj3.getName() + " with Value of " + attackValue);
            obj3.defend(attackValue);
            System.out.println(obj3.getName() + " Defended. Health Updated to " + obj3.getHealthCurrent() + "\n\n");
            attackValue = -1; //Reset attackValue in main method for testing


            if (obj3.getHealthCurrent() > 0){ //Obj3 can only fight back if not dead

                attackValue = obj3.attack();
                System.out.println(obj3.getName() + " Attacked " + obj2.getName() + " with Value of " + attackValue);
                obj2.defend(attackValue);
                System.out.println(obj2.getName() + " Health Updated to " + obj2.getHealthCurrent() + "\n\n");
                attackValue = -1;

            }

            if (obj2.getHealthCurrent() <= 0){

                System.out.println(obj2.getName() + " Died.");

            }

            if (obj3.getHealthCurrent() <= 0){

                System.out.println(obj3.getName() + " Died.");

            }

        }

        //Print Values for all Characters:

        System.out.println("\n________________________________________________________________________");
        System.out.println("Current Values for All Characters: ");
        System.out.println(obj1.toString());
        System.out.println("\n" + obj2.toString());
        System.out.println("\n" + obj3.toString());

    }


}