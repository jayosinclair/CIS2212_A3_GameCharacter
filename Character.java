/**
 * The Character class contains a blueprint for character attributes and actions. It contains accessor/mutator (getter/setter) methods.
 * 
 */


public class Character {
    
    //******************************************************MEMBER VARIABLES********************************************************

    private int id;
    private String name;
    private int level;
    private int health;
    private int attack;
    private int magic;
    private int defense;
    private int luck;
    
     //*******************************************************MEMBER METHODS********************************************************

    //*******************************************************MEMBER METHODS********************************************************

    /**
     * Constructor Character() initializes values for member variables with values that can be used to detect errors if left empty.
     */

    public Character(){

        id = -1;
        name = "error";
        level = -1;
        health = -1;
        attack = -1;
        magic = -1;
        defense = -1;
        luck = -1;

    }

    //Constructor with Parameters:

/**
 * 
 * @param idVal
 * @param nameVal
 * @param levelVal
 * @param healthVal
 * @param attackVal
 * @param magicVal
 * @param defenseVal
 * @param luckVal
 */

    public Character(int idVal, String nameVal, int levelVal, int healthVal, int attackVal, int magicVal, int defenseVal, int luckVal){

        id = idVal;
        name = nameVal;
        level = levelVal;
        health = healthVal;
        attack = attackVal;
        magic = magicVal;
        defense = defenseVal;
        luck = luckVal;

    }

    //Mutators:

    /**
     * 
     * @param idVal
     */
    public void setID(int idVal){

        this.id = idVal;

    }


    /**
     * 
     * @param nameVal
     */
    public void setName(String nameVal){

        this.name = nameVal;

    }

    /**
    * 
    * @param levelVal
    */
    public void setLevel(int levelVal){

        this.level = levelVal;

    }


    /**
     * 
     * @param healthVal
     */
    public void setHealth(int healthVal){

        this.health = healthVal;

    }


    /**
     * 
     * @param attackVal
     */
    public void setAttack(int attackVal){

        this.attack = attackVal;

    }


    /**
     * 
     * @param magicVal
     */
    public void setMagic(int magicVal){

        this.magic = magicVal;

    }


    /**
     * 
     * @param defenseVal
     */
    public void setDefense(int defenseVal){

        this.defense = defenseVal;

    }


    /**
     * 
     * @param luckVal
     */
    public void setLuck(int luckVal){

        this.luck = luckVal;

    }


    //Accessors:

    /**
     * 
     * @return
     */
    public int getID(){

        return id;

    }


    /**
     * 
     * @return
     */
    public String getName(){

        return name;

    }


    /**
     * 
     * @return
     */
    public int getLevel(){

        return level;

    }


    /**
     * 
     * @return
     */
    public int getHealth(){

        return health;

    }


    /**
     * 
     * @return
     */
    public int getAttack(){

        //Attack number represents strength of the attack
        return attack;

    }


    /**
     * 
     * @return
     */
    public int getMagic(){

        return magic;

    }


    /**
     * 
     * @return
     */
    public int getDefense(){

        return defense;

    }


    /**
     * 
     * @return
     */
    public int getLuck(){

        return luck;

    }


    //Other Methods:


    @Override
    public String toString(){

        String value =  "\nName: " + name +
                        "\nLevel: " + level +
                        "\nHealth: " + health +
                        "\nAttack: " + attack +
                        "\nMagic: " + magic +
                        "\nDefense: " + defense +
                        "\nLuck: " + luck;

        return value;
    
    }


    /**
     * 
     */
    public int attack(){

        int attackStrength = -1;

        attackStrength = this.level * attack;

        return attackStrength;

    }


    /**
     * 
     */
    public void defend(int attackStrength){

    }


}
