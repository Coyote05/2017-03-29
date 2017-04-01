package homework03;

import java.util.Scanner;

public class Temperature {

    public void getTemperatureDataFromConsole() {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Add meg a következő hőmérsékletet!");
            numbers[i] = scanner.nextInt();
        }
    }

    public void printHighestTemperature(int[] numbers) {

        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                System.out.println(maxValue);
            }
        }
    }

    public void printLowestTemperature(int[] numbers) {

        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                System.out.println(minValue);
            }
        }
    }
}




