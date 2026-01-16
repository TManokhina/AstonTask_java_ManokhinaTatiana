package manokhina.java.task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int a = readInt(scanner, "Введите первое число (a): ");
            int b = readInt(scanner, "Введите второе число (b): ");

            if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }

            System.out.println("Сложение: " + (a + b));
            System.out.println("Вычитание: " + (a - b));
            System.out.println("Умножение: " + (a * b));

            if (b != 0) {
                System.out.println("Деление: " + (a / (double) b));
            } else {
                System.out.println("Деление на ноль невозможно");
            }

        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: пожалуйста, введите целое число!");
                scanner.nextLine();
            }
        }
    }
}