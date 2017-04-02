package homework03;

import java.util.Scanner;

public class Temperature {

    public void getTemperatureDataFromConsole() {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int i;
        int minValue;
        int maxValue;

        for (i = 0; i < numbers.length; i++) {
            System.out.println("Add meg a következő hőmérsékletet!");
            numbers[i] = scanner.nextInt();
        }

        minValue = numbers[0];
        for (i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        maxValue = numbers[0];
        for (i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println(maxValue);
    }
    public void printLowestTemperature() {

        System.out.println("A legalacsonyabb hőmérséklet: ");
    }

    public void printHighestTemperature() {

        System.out.println("A legmagasabb hőmérséklet: ");
    }
}




