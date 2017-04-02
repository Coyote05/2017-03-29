package homework03;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public int playBarchobaWithNumbers(){

        Random generator = new Random();

        int num = generator.nextInt(0+50);

        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; --i){
            System.out.println("Következő tipp (lehetőségek száma - " + i + ")");

            int userNumber = scanner.nextInt();

            if(i < 2){
                System.out.println("Vesztettél!");
                break;
            }
            else if(num > userNumber){
                System.out.println("A szám nagyobb.");
            }
            else if(num < userNumber){
                System.out.println("A szám kisebb.");
            }
            else if (num == userNumber){
                System.out.println("A játékos nyert!");
                break;
            }
            else{
                System.out.println("Hiba történt!");
            }
        }
        return num;
    }
}
