public class Main {

    public static void main(String args[]){

        //Creates an object from the Player class
        Player player = new Player();

        //Sets the attributes
        player.setName("Saba");
        player.setHitPoints(20);
        player.setDamagePoints(5);
        player.setLevel(10);
        player.setExperiencePoints(5);

        player.gainExperience(5);

        System.out.println("Level: " + player.getLevel());
        System.out.println("Hit Points: " + player.getHitPoints());
        System.out.println("Damage Points: " + player.getDamagePoints());

        //Creates an enemy object
        Enemy enemy = new Enemy();
        enemy.setName("Clinton");
        enemy.setHitPoints(12);
        enemy.setDamagePoints(6);
        enemy.setType("Enemy");

        //Creates an object from the gameCharacter class
        GameCharacter gameCharacter = new GameCharacter();

        gameCharacter.attack(enemy);
        System.out.println("Enemy's Hit Points: " + enemy.getHitPoints());

        gameCharacter.attack(player);
        System.out.println("Player's Hit Points: " + player.getHitPoints());

        gameCharacter.attack(enemy);
        System.out.println("Enemy's Hit Points: " + enemy.getHitPoints());

        gameCharacter.attack(player);
        System.out.println("Player's Hit Points: " + player.getHitPoints());

        System.out.println(player.getName() + " won!");

    }
}
