package hu.helixlab.homework;

import homework03.PasswordGenerator;
import homework03.User;
import homework03.Temperature;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String base = new String("base");

        Random generator = new Random();

        for (int i = 0; i < 20; ++i) {

            System.out.println(base + (generator.nextInt()));
        }

        User user1 = new User("Bela");
        System.out.println(user1.toString());

        Random random = new Random();
        for(int i=1; i < 20; ++i){
            System.out.println(new User("Bela"+i).toString());
        }
        System.out.println();
        System.out.println("Első feladat");
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        System.out.println("\t" + passwordGenerator.generatePassword());

        System.out.println();
        System.out.println("Második feladat");                  //Kicserélve a régi jelszó (id+Username+id)



        System.out.println("Negyedik feladat");

        Temperature temperature = new Temperature();

        //temperature.getTemperatureDataFromConsole();
        //temperature.printLowestTemperature();
        //temperature.printHighestTemperature();

    }

}

