package Day7;

import java.util.SortedMap;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player.info();

        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();

        Player.info();


        Player player7 = new Player();
        Player.info();


        for (int i = 0; i < player3.getStamina() ; i++) {
            player4.run();

        }
        Player.info();
//        System.out.println(Player.getCountPlayers());
//        System.out.println(player1.getStamina());

    }
}
