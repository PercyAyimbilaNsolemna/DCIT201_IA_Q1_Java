public class Main {

    public static void main(String args[]){

        //Creates an object from the Player class
        Player player = new Player();

        //Sets the attributes
        player.setName("Saba");
        player.setHitPoints(10);
        player.setDamagePoints(5);
        player.setLevel(10);
        player.setExperiencePoints(5);

        player.gainExperience(5);

        System.out.println("Level: " + player.getLevel());
        System.out.println("Hit Points: " + player.getHitPoints());
        System.out.println("Damage Points: " + player.getDamagePoints());
    }
}
