package com.pb.oliinyk.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сделайте первый ввод текста");
        String userStr1 = scan.nextLine();
        if (userStr1.isEmpty())
        {
            System.out.println("Вы ничего не ввели при первом вводе текста");
        }
        System.out.println("Сделайте второй ввод текста");
        String userStr2 = scan.nextLine();
        if (userStr2.isEmpty())
        {
            System.out.println("Вы ничего не ввели при втором вводе текста");
        }
        System.out.println("Вы ввели текст следующего вида :");
        System.out.println(userStr1);
        System.out.println(userStr2);
        myAnagram (userStr1,userStr2);
    }
    static void myAnagram (String a, String b)
    {
        a = a.replaceAll("[^A-Za-zА-Яа-я0-9ІіЄє]", "");
        b = b.replaceAll("[^A-Za-zА-Яа-я0-9ІіЄє]", "");
        a = a.toLowerCase();
        b = b.toLowerCase();
        char [] userChar1= a.toCharArray();
        char [] userChar2= b.toCharArray();
        Arrays.sort(userChar1);
        Arrays.sort(userChar2);
        if (Arrays.equals(userChar1,userChar2))
        {
            System.out.println("Текст при первом вводе является анаграммой текста при втором вводе");
        }
        else
        {
            System.out.println("Текст при первом вводе не является анаграммой текста при втором вводе");
        }
    }
}