package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int Chislo = in.nextInt();
        byte mnozh = 1;
        System.out.println("Таблица умножения для вашего числа:");
        System.out.println(Chislo+" * 1 = "+ Chislo*mnozh++);
        System.out.println(Chislo+" * 2 = "+ Chislo*mnozh++);
        System.out.println(Chislo+" * 3 = "+ Chislo*mnozh++);
        System.out.println(Chislo+" * 4 = "+ Chislo*mnozh++);
        System.out.println(Chislo+" * 5 = "+ Chislo*mnozh++);
        System.out.println(Chislo+" * 6 = "+ Chislo*mnozh++);
        System.out.println(Chislo+" * 7 = "+ Chislo*mnozh++);
        System.out.println(Chislo+" * 8 = "+ Chislo*mnozh++);
        System.out.println(Chislo+" * 9 = "+ Chislo*mnozh++);
        System.out.println(Chislo+" * 10 = "+ Chislo*mnozh++);
    }
}
