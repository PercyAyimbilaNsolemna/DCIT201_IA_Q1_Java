public class Player extends GameCharacter{
    //Declares the attributes of the class
    private int level;
    private int experiencePoints;

    //Creates a signature constructor for the class
    public Player (){

    }

    //Creates a getter and setter methods for the level
    public int getLevel(){
        return this.level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    //Creates a getter and getter methods for the gameExperience attributes
    public int getExperiencePoints(){
        return this.experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints){
        this.experiencePoints = experiencePoints;
    }






}
