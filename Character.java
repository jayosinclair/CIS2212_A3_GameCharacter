/*Author: Jay Olson
Section: CIS 2212-801
Assignment: Project 3 Game Character
Due Date: February 25, 2026
Submitted: February 21, 2026
*/


import java.util.Random;

/**
 * The Character class contains a blueprint for character attributes and actions. It contains accessor/mutator (getter/setter) methods.
 * 
 */

public class Character {
    
    //******************************************************MEMBER VARIABLES********************************************************

    private String name; //Identifying name for the character, represented in English
    private int level; //Current "level" character has attained. Level can be tied to other attributes such as health, defense, etc.
    private int expPtsCurrent; //Experience points are gained when beating enemies. This is the current level of exp pts for the character
    private int nextLvlExpPts; //Indicator for how many experience points are required for the next level up
    private int defense; //How much character can resist damage from an attack
    private int attackVanilla; //How much baseline pain can be inflicted on attack
    private int attackSpecial;
    private int healthCurrent; //Amount of health character has remaining before falling
    private int healthCapacity; //Amount of possible health at the current level
    private int magicCurrent; //Amount of magic character currently has
    private int magicCapacity; //Amount of possible magic at the current level
    private boolean luck; //Flag for whether player has "luck" that can be used on next turn to reduce damage OR increase damage, depending on whether move is offensive or defensive. This is a power-up
    Random rgen = new Random(); //Make a random object
    
    //*******************************************************MEMBER METHODS********************************************************

    /**
     * Constructor Character() initializes values for member variables with values that can be used to detect errors in debugging if left empty
     */

    public Character(){

        name = "error";
        level = -1;
        expPtsCurrent = -1;
        nextLvlExpPts = -1;
        defense = -1;
        attackVanilla = -1;
        attackSpecial = -1;
        healthCurrent = -1;
        healthCapacity = -1;
        magicCurrent = -1;
        magicCapacity = -1;
        luck = false;

    }


    /**
     * 
     * Constructor Character(...Parameters...) initializes values with arguments passed in
     * 
     * @param nameVal
     * @param levelVal
     * @param expPtsCurrentVal
     * @param nextLvlExpPtsVal
     * @param defenseVal
     * @param attackVanillaVal
     * @param attackSpecialVal
     * @param healthCurrentVal
     * @param healthCapacityVal
     * @param magicCurrentVal
     * @param magicCapacityVal
     * @param luckVal
     */

    public Character(String nameVal, int levelVal, int expPtsCurrentVal, int nextLvlExpPtsVal, int defenseVal, int attackVanillaVal, int attackSpecialVal, int healthCurrentVal, int healthCapacityVal, int magicCurrentVal, int magicCapacityVal, boolean luckVal){

        name = nameVal; //By assigning all these values without using setter methods, I'm assuming that the arguments passed in are valid/make sense in the first place (e.g., there is not a negative healthCurrent value). I did not use setter methods because the book doesn't when discussed at Figure 4.6.2.
        level = levelVal;
        expPtsCurrent = expPtsCurrentVal;
        nextLvlExpPts = nextLvlExpPtsVal;
        defense = defenseVal;
        attackVanilla = attackVanillaVal;
        attackSpecial = attackSpecialVal;
        healthCurrent = healthCurrentVal;
        healthCapacity = healthCapacityVal;
        magicCurrent = magicCurrentVal;
        magicCapacity = magicCapacityVal;
        luck = luckVal;

    }

    //Mutators:

    /**
     * 
     * The setName method assigns a character's name identifier to the name instance variable given a String argument
     * 
     * @param nameVal
     */

    public void setName(String nameVal){

        name = nameVal;

        //I had originally written this as this.name = nameVal, but I changed it to match what the book shows to do with making setters. I'm not sure if it really matters here anyway since there isn't room for ambiguity

    }


    /**
    * 
    * The setLevel method assigns an argument's value to the level instance variable. This method is used upon
    * character initialization and each level up
    * 
    * @param levelVal
    */
    public void setLevel(int levelVal){

        level = levelVal;

    }


    /**
     * 
     * The setExpPts method assigns an argument's value to the expPts instance variable. This method is used upon initialization and
     * it is used to update experience points each time a foe is defeated
     * 
     * @param expPtsCurrentVal
     */

    public void setExpPtsCurrent(int expPtsCurrentVal){

        expPtsCurrent = expPtsCurrentVal;

    }


    /**
     * 
     * The setNextLvlExpPts method assigns an argument's value to the nextLvlExpPts instance variable to
     * keep track of how many experience points are needed to qualify for the next level up.
     * 
     * @param nextLvlExpPtsVal
     */

    public void setNextLvlExpPts(int nextLvlExpPtsVal){

        nextLvlExpPts = nextLvlExpPtsVal;

    }


    /**
     * 
     * The setDefense method updates the defense instance variable with how much a character can withstand an attack
     * 
     * @param defenseVal
     */

    public void setDefense (int defenseVal){

        defense = defenseVal;

    }


    /**
     * 
     * The setAttackVanilla method updates the baseline pain that can be inflicted upon a "normal" attack
     * 
     * @param attackVanillaVal
     */

    public void setAttackVanilla (int attackVanillaVal){

        attackVanilla = attackVanillaVal;

    }


    /**
     * 
     * The setAttackSpecial method updates the baseline pain that can be inflicted upon a special attack
     * 
     * @param attackVanillaVal
     */

    public void setAttackSpecial (int attackSpecialVal){

        attackSpecial = attackSpecialVal;

    }


    /**
     * 
     * The setHealthCurrent method assigns an argument's value to the healthCurrent instance variable. This method is used
     * upon character initialization and each time an opponent makes an offensive move.
     * 
     * @param healthCurrentVal
     */

    public void setHealthCurrent(int healthCurrentVal){

        if (healthCurrentVal < 0){
            healthCurrentVal = 0; //No need to go into negative health
        }
        
        healthCurrent = healthCurrentVal;

    }


    /**
     * 
     * The setHealthCapacity method assigns an argument's value to the healthCapacity instance variable. This method is used
     * upon character initialization and each time a character levels up
     * 
     * @param healthCapacityVal
     */

    public void setHealthCapacity(int healthCapacityVal){

        healthCapacity = healthCapacityVal;

    }


    /**
    * 
    * The setMagicCurrent method assigns an argument's value to the magicCurrent instance variable. This method is used
    * each time magic is either increased (result of replenishing magic) or decreased (result of using magic)
    * 
    * @param magicCurrentVal
    */

    public void setMagicCurrent(int magicCurrentVal){

        magicCurrent = magicCurrentVal;

    }


    /**
     * 
     * The setMagicCapacity method assigns an argument's value to the magicCapacity instance variable. This method is used
     * each time magic is either increased (result of replenishing magic) or decreased (result of using magic)
     * 
     * @param magicCapacityVal
     */

    public void setMagicCapacity(int magicCapacityVal){

        magicCapacity = magicCapacityVal;

    }


    /**
     * 
     * The setLuck method assigns an argument's value to the luck instance variable. This method is used to reduce defensive damage
     * 
     * @param luckVal
     */
    public void setLuck(boolean luckVal){

        luck = luckVal;

    }




    //Accessors:

    /**
     * 
     * The getName method returns the character object's name as a string
     * 
     * @return
     */
    public String getName(){

        return name;

    }


    /**
     * 
     * The getLevel method returns the character object's current level
     * 
     * @return
     */
    public int getLevel(){

        return level;

    }


    /**
     * 
     * The getExpPtsCurrent method returns the character object's current experience points
     * 
     * @return
     */

    public int getExpPtsCurrent(){

        return expPtsCurrent;

    }


    /**
     * 
     * The getNextLvlExpPts method returns the needed experience points to level up
     * 
     * @return
     */

    public int getNextLvlExpPts(){

        return nextLvlExpPts;

    }


    /**
     * 
     * The getDefense method returns the current baseline defense level for a given character
     * 
     * @return
     */

    public int getDefense(){

        return defense;

    }


    /**
     * 
     * The getAttackVanilla method returns how much baseline pain can be inflicted on an enemy with an attack
     * 
     * @return
     */

    public int getAttackVanilla(){

        return attackVanilla;

    }


    /**
     * 
     * The getAttackSpecial method returns how much baseline pain can be inflicted on an enemy with a special attack
     * 
     * @return
     */

    public int getAttackSpecial(){

        return attackSpecial;

    }


    /**
     * 
     * The getHealthCurrent method returns the character object's current health level (A.K.A. Hit Points/ HP)
     * 
     * @return
     */
    public int getHealthCurrent(){

        return healthCurrent;

    }


    /**
     * 
     * The getHealthCapacity method returns the character object's potential health level (A.K.A. Hit Points/ HP) within the current level
     * 
     * @return
     */
    public int getHealthCapacity(){

        return healthCapacity;

    }


    /**
     * 
     * The getMagicCurrent method returns the character object's current magic level
     * 
     * @return
     */
    public int getMagicCurrent(){

        return magicCurrent;

    }


    /**
     * 
     * The getMagicCapacity method returns the character object's potential magic level within the current level
     * 
     * @return
     */
    public int getMagicCapacity(){

        return magicCapacity;

    }


    /**
     * 
     * The getLuck returns the character object's luck status for the next turn, which affects defense
     * 
     * @return
     */

    public boolean getLuck(){

        return luck;

    }


    //Other Methods:


    /**
     * The overridden toString method returns a string containing various attribute values for a character object
     */

    @Override
    public String toString(){

        String value =  "\nName: " + name +
                        "\nLevel: " + level +
                        "\nExp Pts: " + expPtsCurrent +
                        "\nNext Level at: " + nextLvlExpPts +
                        "\nDefense: " + defense +
                        "\nNormal Attack: " + attackVanilla +
                        "\nSpecial Attack: " + attackSpecial +
                        "\nHealth: " + healthCurrent +
                        "\nHealth Capacity: " + healthCapacity +
                        "\nMagic: " + magicCurrent +
                        "\nMagic Capacity: " + magicCapacity +
                        "\nLuck: " + luck;

        return value;
    
    }


    /**
     * 
     * The attack method calculates and returns a value for an offensive move against an opponent. The attack method
     * applies a random number against current baseline attribute levels in the calculation
     * 
     */
    public int attack(){

        int attackStrength = attackVanilla;

        this.luck = rgen.nextBoolean(); //Use a random number generator to get a boolean value that is assigned to luck, which is used to intensify the attack if true.

    
        if (this.luck){

            int randomNum = -1; //Random int with a switch statement just for fun and to further randomize.

            randomNum = rgen.nextInt(3); 
            
            switch (randomNum) { 

                case 0: attackStrength += 11;
                        break;
                    
                case 1: attackStrength += 53;
                        break;

                case 2: attackStrength += 99999;
                        break;

                default: attackStrength = 0; //If a 0 attack is encountered, it's a clue that there was an unhandled error with the switch/random int construct.

            }
            
        }

        else{

        attackStrength = attackStrength += 5;


        }

        this.luck = false; //Reset luck

        return attackStrength;

    }


    /**
     * 
     * The attackSpecial method calculates and returns a value for an offensive move against an opponent when magic is used for a "special" attack. The attackSpecial method
     * applies a random number against current baseline attribute levels in the calculation, including the adjustment for the special move
     * 
     */

    public int attackSpecial(){

        int attackStrength = attackSpecial;

        this.luck = rgen.nextBoolean(); //Use a random number generator to get a boolean value that is assigned to luck, which is used to intensify the attack if true.
    
        if (this.luck){

            attackStrength += 70;

        }

        else{

        attackStrength = attackStrength += 40;


        }

        setMagicCurrent(0); //Update the current magic meter to deplete all the way to 0. Character would need to gain more magic to use a special move again

        this.luck = false; //Reset luck

        return attackStrength;

    }


    /**
     * 
     * The defend method receives an integer attackStrength argument, processes the attack value against defense and luck
     * levels, and degrades health/other applicable attributes
     * 
     */
    public void defend(int attackStrength){

        int defenseVal = defense;
        int healthVal = healthCurrent;
        int healthPotential = healthCapacity;


        this.luck = rgen.nextBoolean(); //Use a random number generator to get a boolean value that is assigned to luck, which is used to heighten defense if true.

        if (this.luck){

            int randomNum = rgen.nextInt(3); 
            
            switch (randomNum) { 

                case 0: defenseVal += 2;
                        break;
                    
                case 1: defenseVal += 33;
                        break;

                case 2: defenseVal += 78561;
                        break;

                default: defenseVal = 0; //If a 0 defenseVal is encountered, it's a clue that there was an unhandled error with the switch/random int construct.

            }
            
        }

        this.luck = false; //Reset luck


        //Make sure defense doesn't add to health if it outflanks the attack

        if (attackStrength < defenseVal){

            defenseVal = attackStrength;

        }


        //Update health

        healthVal = healthVal - attackStrength + defenseVal;

        if (healthVal > healthPotential){ //Make sure defense doesn't raise health more than health can possibly be

            healthVal = healthPotential;

        }

        this.setHealthCurrent(healthVal); //I used the setter method for setHealthCurrent rather than just assigning healthVal directly to healthCurrent since setHealthCurrent controls for setting a health value < 0

    }

    /**
     * 
     * The levelUp method increases values for various attributes within the class.
     * The values right now are arbitrary and static, but this could later be extended read in from a file.
     * 
     */


    public void levelUp(){

        level += 1; //Assuming there's no such thing as a max level for now... This implementation can be updated one day. I kept it simple here and did not use setters with validations within those methods.
        nextLvlExpPts += 200;
        defense += 45;
        attackVanilla += 22;
        attackSpecial += 47;
        healthCapacity += 50;
        healthCurrent = healthCapacity;
        magicCapacity += 23;
        magicCurrent = magicCapacity;

    }


}
