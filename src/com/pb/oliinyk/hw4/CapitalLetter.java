package com.pb.oliinyk.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        System.out.println("Введите текст для преобразования");
        Scanner scan = new Scanner(System.in);
        String userString = scan.nextLine();
        if (userString.isEmpty())
        {
            System.out.println("Вы  ничего не ввели для преобразования");
        }
        else
        {
            System.out.println("Вы ввели текст следующего вида:");
            System.out.println(userString);
            firstUp(userString);
        }
    }
    static void firstUp(String userString)
    {

        String [] userMas = userString.split(" ");
        String result = "";
        for (int i = 0; i < userMas.length; i++)
        {
            result += userMas[i].substring(0, 1).toUpperCase() + userMas[i].substring(1) + " ";
        }
        System.out.println("Преобразованный текст имеет следующий вид:");
        System.out.println(result);

    }
}