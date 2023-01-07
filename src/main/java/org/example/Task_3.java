package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        String inputData = null;
        while (!valid) {
            System.out.print("Введите текст > 0: \t");
            try {
                inputData = scanner.nextLine();
                if (inputData.length() > 0) {
                    valid = true;
                } else {
                    System.out.println("Invalid Input!");
                    valid = false;
                }
            } catch (Exception ex) {
                valid = false;
            }
        }
        System.out.println("Вы ввели следующее: " + inputData);
    }

}
