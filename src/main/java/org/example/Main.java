package org.example;

import java.util.Scanner;
/**
 * Calculator with switch function
 * @author FellGast
 * @see #main(String[])
 */



public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char operation;


        Scanner input = new Scanner(System.in);

        System.out.println("Ввести первое число");
        num1 = input.nextDouble();

        System.out.println("Ввести второе число");
        num2 = input.nextDouble();

        System.out.println("Выбор оператора: +, -, *, или /");
        operation = input.next().charAt(0);

        switch (operation) {

            // сложение
            case '+':
                result = num1 + num2;
                System.out.printf( "Ответ: " + "%.4f", result );
                break;

            // вычитание
            case '-':
                result = (num1 - num2);
                System.out.printf("Ответ: " + "%.4f", result);
                break;

            // умножение
            case '*':
                result = num1 * num2;
                System.out.printf("Ответ: " + "%.4f", result);
                break;

            // деление
            case '/':
                result = num1 / num2;
                System.out.printf("Ответ: " + "%.4f", result);
                break;

            default:
                System.out.println("Нет такого оператора!");
                break;
        }
        input.close();

    }
}
