abstract public class GameCharacter {

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
}