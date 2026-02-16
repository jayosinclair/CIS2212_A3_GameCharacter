import java.util.Random;

/**
 * The Character class contains a blueprint for character attributes and actions. It contains accessor/mutator (getter/setter) methods.
 * 
 */

public class Character {
    
    //******************************************************MEMBER VARIABLES********************************************************

    private String name;
    private int level; //I put scaffolding in place to build out a level-up system. As battles are won, experience points are gained
    private int expPts; //Current accounting of experience points for the character
    private int nextLvlExpPts; //Number of points needed to attain the next level up. Each character levels up at different intervals
    private int health;
    private int magic; //This could be used later to extend with having magic attack and magic defense
    private int luck;
    Random rgen = new Random();
    
    //*******************************************************MEMBER METHODS********************************************************

    /**
     * Constructor Character() initializes values for member variables with values that can be used to detect errors in debugging if left empty.
     */

    public Character(){

        name = "error";
        level = -1;
        expPts = -1;
        nextLvlExpPts = -1;
        health = -1;
        magic = -1;
        luck = -1;

    }


    /**
     * 
     * Constructor Character(...Parameters...) initializes values with arguments passed in.
     * 
     * @param nameVal
     * @param levelVal
     * @param expPtsVal
     * @param nextLvlExpPtsVal
     * @param healthVal
     * @param magicVal
     * @param luckVal
     */

    public Character(String nameVal, int levelVal, int expPtsVal, int nextLvlExpPtsVal, int healthVal, int magicVal, int luckVal){

        name = nameVal;
        level = levelVal;
        expPts = expPtsVal;
        nextLvlExpPts = nextLvlExpPtsVal;
        health = healthVal;
        magic = magicVal;
        luck = luckVal;

    }

    //Mutators:

    /**
     * 
     * The setName method assigns a character's name identifier to the name instance variable given a String argument.
     * 
     * @param nameVal
     */

    public void setName(String nameVal){

        this.name = nameVal;

    }


    /**
    * 
    * The setLevel method assigns an argument's value to the level instance variable. This method is used upon
    * character initialization and each level up.
    * 
    * @param levelVal
    */
    public void setLevel(int levelVal){

        this.level = levelVal;

    }


    /**
     * 
     * The setExpPts method assigns an argument's value to the expPts instance variable. This method is used upon initialization and
     * it is used to update experience points each time a foe is defeated.
     * 
     * @param expPtsVal
     */

    public void setExpPts(int expPtsVal){

        this.expPts = expPtsVal;

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
     * The setHealth method assigns an argument's value to the health instance variable. This method is used
     * upon character initialization and each time an opponent makes an offensive move.
     * 
     * @param healthVal
     */

    public void setHealth(int healthVal){

        this.health = healthVal;

    }


    /**
     * 
     * The setMagic method assigns an argument's value to the magic instance variable. This method is used
     * each time magic is either increased (result of replenishing magic) or decreased (result of using magic).
     * 
     * @param magicVal
     */

    public void setMagic(int magicVal){

        this.magic = magicVal;

    }


    /**
     * 
     * The setLuck method assigns an argument's value to the luck instance variable. This method is used to either increase
     * offensive or defensive damage.
     * 
     * @param luckVal
     */
    public void setLuck(int luckVal){

        this.luck = luckVal;

    }


    //Accessors:

    /**
     * 
     * This method returns the character object's name as a string.
     * 
     * @return
     */
    public String getName(){

        return name;

    }


    /**
     * 
     * This method returns the character object's current level.
     * 
     * @return
     */
    public int getLevel(){

        return level;

    }


    /**
     * 
     * This method returns the character object's current experience points.
     * 
     * @return
     */

    public int getExpPts(){

        return expPts;

    }


    /**
     * 
     * This method returns the needed experience points to level up.
     * 
     * @return
     */

    public int getNextLvlExpPts(){

        return nextLvlExpPts;

    }


    /**
     * 
     * This method returns the character object's current health level (A.K.A. Hit Points/ HP).
     * 
     * @return
     */
    public int getHealth(){

        return health;

    }


    /**
     * 
     * This method returns the character object's current magic level.
     * 
     * @return
     */
    public int getMagic(){

        return magic;

    }


    /**
     * 
     * This method returns the character object's luck level.
     * 
     * @return
     */
    public int getLuck(){

        return luck;

    }


    //Other Methods:


    /**
     * The overridden toString method returns a string containing various attribute values for a character object.
     */

    @Override
    public String toString(){

        String value =  "\nName: " + name +
                        "\nLevel: " + level +
                        "\nHealth: " + health +
                        "\nMagic: " + magic +
                        "\nLuck: " + luck;

        return value;
    
    }


    /**
     * 
     * The attack method calculates and returns a value for an offensive move against an opponent. The attack method
     * checks applies a random number against current attribute levels in the calculation.
     * 
     */
    public int attack(){

        //FIXME: The attack method must return a number that represents the strength of the attack. 
        //Use instance variables (for example, strength, current weapon, etc.) and a random number 
        //to calculate the attack strength value.

        int attackStrength = -1;
        int rnd = rgen.nextInt(10);


        //Use the level to determine baseline attackStrength:

        switch (this.level) {

            case 1: attackStrength = 10;
                break;
            
            case 2: attackStrength = 15;
                break;

            case 3: attackStrength = 20;
                break;
            
            case 4: attackStrength = 35;
                break;
            
            case 5: attackStrength = 60;
                break;

            case 6: attackStrength = 90;
                break;

            case 7: attackStrength = 130;
                break;

            case 8: attackStrength = 170;
                break;
            
            case 9: attackStrength = 300;
                break;
            
            case 10: attackStrength = 500;
                break;
            
            default: attackStrength = -1;

        }



        if (this.luck > 10){

            attackStrength *= rnd;

            this.setLuck(0); //reset luck

        }

        //FIXME: Add magic mechanic.



        return attackStrength;

    }


    /**
     * 
     * The defend method receives an integer attackStrength argument, processes the attack value against defense and luck
     * levels, and degrades health and other attributes.
     * 
     */
    public void defend(int attackStrength){

        //FIXME: The defend method should use a calculation using instance variables and a random number to degrade health and/or other attributes.

        int defenseValue = -1;
        int rnd = rgen.nextInt(10);




        switch (this.level) {

            case 1: defenseValue = 7;
                break;
            
            case 2: defenseValue = 12;
                break;

            case 3: defenseValue = 20;
                break;
            
            case 4: defenseValue = 30;
                break;
            
            case 5: defenseValue = 55;
                break;

            case 6: defenseValue = 80;
                break;

            case 7: defenseValue = 125;
                break;

            case 8: defenseValue = 190;
                break;
            
            case 9: defenseValue = 310;
                break;
            
            case 10: defenseValue = 600;
                break;
            
            default: defenseValue = -1;

        }

        defenseValue -= attackStrength;

        this.health = this.health - defenseValue; //FIXME: This mechanic doesn't work.

    }


}
