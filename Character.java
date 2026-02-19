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
    private boolean luck; //Flag for whether player has "luck" that can be used on next turn to reduce damage. This is a power-up
    Random rgen = new Random();
    
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

        name = nameVal;
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

        this.name = nameVal;

    }


    /**
    * 
    * The setLevel method assigns an argument's value to the level instance variable. This method is used upon
    * character initialization and each level up
    * 
    * @param levelVal
    */
    public void setLevel(int levelVal){

        this.level = levelVal;

    }


    /**
     * 
     * The setExpPts method assigns an argument's value to the expPts instance variable. This method is used upon initialization and
     * it is used to update experience points each time a foe is defeated
     * 
     * @param expPtsCurrentVal
     */

    public void setExpPtsCurrent(int expPtsCurrentVal){

        this.expPtsCurrent = expPtsCurrentVal;

    }


    /**
     * 
     * The setNextLvlExpPts method assigns an argument's value to the nextLvlExpPts instance variable to
     * keep track of how many experience points are needed to qualify for the next level up.
     * 
     * @param nextLvlExpPtsVal
     */

    public void setNextLvlExpPts(int nextLvlExpPtsVal){

        this.nextLvlExpPts = nextLvlExpPtsVal;

    }


    /**
     * 
     * The setDefense method updates the defense instance variable with how much a character can withstand an attack
     * 
     * @param defenseVal
     */

    public void setDefense (int defenseVal){

        this.defense = defenseVal;

    }


    /**
     * 
     * The setAttackVanilla method updates the baseline pain that can be inflicted upon a "normal" attack
     * 
     * @param attackVanillaVal
     */

    public void setAttackVanilla (int attackVanillaVal){

        this.attackVanilla = attackVanillaVal;

    }


    /**
     * 
     * The setAttackSpecial method updates the baseline pain that can be inflicted upon a special attack
     * 
     * @param attackVanillaVal
     */

    public void setAttackSpecial (int attackSpecialVal){

        this.attackSpecial = attackSpecialVal;

    }


    /**
     * 
     * The setHealthCurrent method assigns an argument's value to the healthCurrent instance variable. This method is used
     * upon character initialization and each time an opponent makes an offensive move.
     * 
     * @param healthCurrentVal
     */

    public void setHealthCurrent(int healthCurrentVal){

        this.healthCurrent = healthCurrentVal;

    }


    /**
     * 
     * The setHealthCapacity method assigns an argument's value to the healthCapacity instance variable. This method is used
     * upon character initialization and each time a character levels up
     * 
     * @param healthCapacityVal
     */

    public void setHealthCapacity(int healthCapacityVal){

        this.healthCapacity = healthCapacityVal;

    }


    /**
    * 
    * The setMagicCurrent method assigns an argument's value to the magicCurrent instance variable. This method is used
    * each time magic is either increased (result of replenishing magic) or decreased (result of using magic)
    * 
    * @param magicCurrentVal
    */

    public void setMagicCurrent(int magicCurrentVal){

        this.magicCurrent = magicCurrentVal;

    }


    /**
     * 
     * The setMagicCapacity method assigns an argument's value to the magicCapacity instance variable. This method is used
     * each time magic is either increased (result of replenishing magic) or decreased (result of using magic)
     * 
     * @param magicCapacityVal
     */

    public void setMagicCapacity(int magicCapacityVal){

        this.magicCapacity = magicCapacityVal;

    }


    /**
     * 
     * The setLuck method assigns an argument's value to the luck instance variable. This method is used to reduce defensive damage
     * 
     * @param luckVal
     */
    public void setLuck(boolean luckVal){

        this.luck = luckVal;

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

        //FIXME: Need to fill in content for this method

        int attackStrength = 0;

        return attackStrength;

    }

    public int attackSpecial(){

        //FIXME: Need to fill in content for this method. Be sure it updates the magic meter.

        int attackStrength = 0;

        return attackStrength;

    }


    /**
     * 
     * The defend method receives an integer attackStrength argument, processes the attack value against defense and luck
     * levels, and degrades health/other applicable attributes
     * 
     */
    public void defend(int attackStrength){

        //FIXME: The defend method should use a calculation using instance variables and a random number to degrade health and/or other attributes


    }


}
