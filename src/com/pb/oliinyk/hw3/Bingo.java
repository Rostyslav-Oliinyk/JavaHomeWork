package com.pb.oliinyk.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        final Random random = new Random();
        int numberBingo = random.nextInt(101);
        int counter = 0;
        System.out.println("Привет! Давай сыграем в игру 'Угадай число'");
        System.out.println("Если захочешь закончить игру досрочно, то введи Выйти");
        do
        {
            try {
                counter++;
                Scanner scan = new Scanner(System.in);
                String number = String.valueOf(numberBingo);
                if (counter == 1) {
                    System.out.println("Это твоя первая попытка");
                } else {
                    System.out.println("Твоя текущая попытка под номером " + counter);
                }
                System.out.println("Введи целое число в диапазоне от 0 до 100");
                String numberUser = scan.next();
                if (numberUser.equals("Выйти"))
                {
                    System.out.println("Жаль, что ты решил закончить досрочно игру");
                    break;
                } else
                {
                    int numberUserInt = Integer.parseInt(numberUser);
                    System.out.println("Tы ввёл значение = " + numberUserInt);
                    if (numberUserInt < numberBingo) {
                        System.out.println("Я загадал больше число, чем ты ввел ");
                    } else if (numberUserInt > numberBingo) {
                        System.out.println("Я загадал меньше число, чем ты ввел ");
                    } else {
                        System.out.println("Поздравляю, ты справился ^_^");
                        break;
                    }
                }
            } catch(Exception e)
            {
                System.out.println("Ты ввел точно не целое число, повтори попытку");
            }

        }
        while (true);
        System.out.println("Колличество твоих попыток " + counter);
    }
}