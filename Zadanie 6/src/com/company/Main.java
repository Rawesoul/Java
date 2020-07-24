package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1. Вводим числа
        System.out.println("Введите число X:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Введите число Y:");
        int y = in.nextInt();
        System.out.println("Введите число Z:");
        int z = in.nextInt();
        //Вычисляем среднее арифметическое
        double Sredn = (double) (x+y+z)/3;
        System.out.println("Среднее арифметическое значение = "+ Sredn);
        //Делим на 2
        double delenie = Sredn/2;
        //Проверям итоговое условие
        if(delenie>3)
            System.out.println("Программа выполнена корректно");
    }
}
