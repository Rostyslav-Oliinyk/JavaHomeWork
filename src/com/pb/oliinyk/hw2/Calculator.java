package com.pb.oliinyk.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try
        {
            int operand1;
            int operand2;
            int result;
            String sign;
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите значения первого целого числа");
            operand1 = scan.nextInt();
            System.out.println("Введите значения второго целого числа");
            operand2 = scan.nextInt();
            System.out.println("Введите параметр арифметического действия");
            sign = scan.next();
            switch (sign) {
                case "+" : result = operand1+operand2;
                    System.out.println("Результат вычислений  - " + result);
                    break;
                case "-" : result = operand1-operand2;
                    System.out.println("Результат вычислений  - " + result);
                    break;
                case "*" : result = operand1*operand2;
                    System.out.println("Результат вычислений  - " + result);
                    break;
                case "/" : if (operand2==0)
                {
                    System.out.println("Деление на 0 невозможно");
                }
                else
                {
                    result = operand1/operand2;
                    System.out.println("Результат вычислений  - " + result);
                }
                    break;
                default:
                    System.out.println("Неизвестный параметр арифметического действия");
            }

        } catch(Exception e)
        {
            System.out.println("Недопустимое значение при вводе целого числа");
        }
    }
}

