package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner Scanner = new Scanner(System.in);
    String symbol;
    int one, two, result;
    System.out.print("Поставьте символ операции(+ - / *) которую котите произвести: ");
    symbol = Scanner.next();
    System.out.print("Введите первое число: ");
    one = Scanner.nextInt();
    System.out.print("Введите второе число: ");
    two = Scanner.nextInt();
    switch (symbol)  {
        case "+":
            result = one + two;
            System.out.println("Ответ: " + result);
            break;
        case "-":
            result = one - two;
            System.out.println("Ответ: " + result);
            break;
        case "/":
            result = one / two;
            System.out.println("Ответ: " + result);
            break;
        case "*":
            result = one * two;
            System.out.println("Ответ: " + result);
            break;
        default:
            System.out.println("Вы Ввели неверную команду попробуйте снова...");
        }
    }
}
