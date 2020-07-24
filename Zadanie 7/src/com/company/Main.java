package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1. Определяем константы
        final byte x = 4;
        final byte y = 4;
        final byte z = 0;
        //2. Вводим число
        System.out.println("Сравнение с константами. Введите число:");
        Scanner in = new Scanner(System.in);
        int Number = in.nextInt();
        String message = "Данное значение имеется в константах";
        //Проверям итоговое условие
        if (Number!=x & Number!=y & Number!=z) {
            System.out.println("Такой константы нет!");
        }
        else {
            System.out.println(message);
        }
    }
}

