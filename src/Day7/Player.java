package Day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;


    public Player() {
        Random random = new Random();
        this.stamina = random.nextInt(10) + 90;
        if (countPlayers < 6) countPlayers++;
    }


    public int getStamina() {  return stamina;  }

    public static int getCountPlayers() {   return countPlayers;   }



    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina --;
        } else return;
        if (stamina == MIN_STAMINA) countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else System.out.println("На поле нет свободных мест");

    }

}
