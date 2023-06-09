public class GameCharacter {
    //Creates the attributes of the GameCharacter class
    private String name;
    private int hitPoints, damagePoints;

    //Creates a signature method for the class
    public GameCharacter(){

    }

    //Creates a setter for the name attribute
    public void setName(String name){
        this.name = name;
    }

    //Creates a getter for the name attribute
    public String getName(){
        return this.name;
    }

    //Creates a setter for the hitPoints attribute
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    //Creates a getter method for the hitPoints attribute
    public int getHitPoints(){
        return this.hitPoints;
    }

    //Creates a setter method for the damagePoints attribute
    public void setDamagePoints(int damagePoints){
        this.damagePoints = damagePoints;
    }

    //Creates a getter method for the damagePoints attribute
    public int getDamagePoints(){
        return this.damagePoints;
    }

    //Creates an attack method
    public void attack(GameCharacter character){
        character.hitPoints = character.hitPoints - character.damagePoints;
    }

}
