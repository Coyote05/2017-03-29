package hu.helixlab.homework;

import homework03.*;

import javax.management.monitor.GaugeMonitor;
import java.lang.reflect.Array;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        UserRegistry userRegistry = new UserRegistry();
        userRegistry.run();


        /*
        String base = new String("base");

        Random generator = new Random();

        for (int i = 0; i < 20; ++i) {

            System.out.println(base + (generator.nextInt()));
        }

        User user1 = new User("Bela");
        System.out.println(user1.toString());

        Random random = new Random();
        for (int i = 1; i < 20; ++i) {
            System.out.println(new User("Bela" + i).toString());
        }
        System.out.println();
        System.out.println("Első feladat");
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        System.out.println("\t" + passwordGenerator.generatePassword(8));

        System.out.println();
        System.out.println("Második feladat");                  //Kicserélve a régi jelszó (id+Username+id)

        System.out.println();
        System.out.println("Harmadik feladat");
        Game game = new Game();
        game.playBarchobaWithNumbers();

        System.out.println();
        System.out.println("Negyedik feladat");
        Temperature temperature = new Temperature();
        temperature.getTemperatureDataFromConsole();
        temperature.printHighestTemperature();
        temperature.printLowestTemperature();

        */
/*
        int[] array = {2, 4, 10, 0, -5, 3, 10};

        int[][] matrix = {{2, 6, 10},
                {5, -1, 0},
                {10, 6, 3}};

        printMatrix(matrix);
        getSumOfEvenNumber(matrix);

    }


        /*
        printArray(array);
        System.out.println("\nMax: " + getMaximumValue(array));
        System.out.println("\nMin: " + getMinimumValue(array));
        System.out.println("\nSum: " + getSum(array));

    }
    */
/*
    public static void printMatrix(int[][] a) {

        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int getSumOfEvenNumber(int[][] a){
        int sum = 0;

        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a.length; ++j){
                if(a[i][j] % 2 == 0){
                    sum = sum + a[i][j];
                }
            }
        }
        return sum;
    }




  /*



    public static void printArray(int[] array){
        for (int i = 0; i < array.length; ++i){
            System.out.print(array[i] + " ");
        }

    }

    public static int getMaximumValue(int[] a){

        int maximum = a[0];

        for(int i = 1; i < a.length; ++i){
            if(maximum < a[i]){
                maximum = a[i];
            }
        }
        return maximum;
    }

    public static int getMinimumValue(int[] a){

        int minimum = a[0];

        for(int i = 1; i < a.length; ++i){
            if(minimum > a[i]){
                    minimum = a[i];
            }
        }
        return minimum;
    }

    public static int getSum(int[] a){
        int sum = 0;

        for(int i = 0; i < a.length; ++i){

            //sum = sum + a[i];
            //ez a kettő ugyanazt jelenti
            sum += a[i];
        }
        return sum;
    }
*/





    }
}





