package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Вводим и считываем двоичное число в строковую переменную
        System.out.println("Введите число в двоичном формате");
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        //Переводим в массив
        char[] massiv = stroka.toCharArray();
        //Запускаем цикл по переводу в десятичное значение
        int desyatich = 0, dlina = stroka.length();
        for (int i = 0; i < dlina; i++) {
            if (massiv[dlina-i-1] == '1') {
                desyatich += Math.pow(2, i);
            };
        };
        //Выводим переменную на экран
        System.out.print("Десятичное значение равно "+desyatich);
    }
}