public class Enemy extends GameCharacter{

    //Declares attributes of the class
    private String type;

    //Creates a getter and setter for the type attribute
    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    //Creates a takeDamage class
    public void takeDamage(int damage){
        this.setHitPoints(this.getHitPoints() - damage);
        System.out.println("Damage dealt was " + damage);
    }
}
