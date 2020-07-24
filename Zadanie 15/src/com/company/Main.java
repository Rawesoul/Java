package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Вводим строку
        System.out.print("Пузырьковая сортировка \nВведите числа через пробел \n");
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        //Переводим строку в строковый массив разделенный по пробелам
        String[] razdel;
        razdel = S.split(" ");
        //Переводим строковый массив в числовой
        double[] massiv = new double[razdel.length];
        for (int i = 0; i < razdel.length; i++) {
            massiv[i] = Double.parseDouble(razdel[i]);
        }
        //Сортируем
        for(int i = massiv.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( massiv[j] > massiv[j+1] ){
                    double tmp = massiv[j];
                    massiv[j] = massiv[j+1];
                    massiv[j+1] = tmp;
                }
            }
        }
        //Выводим итоговый результат
        System.out.println("Отсортированная строка:");
        System.out.println(Arrays.toString(massiv));
        /*
        for (int i = 0; i < massiv.length; i++)
        {
            double drob =  massiv[i] - (int) massiv[i];
            if (drob == 0) {System.out.print((int) massiv[i]);} else {System.out.printf("%.2f",massiv[i]);};
            System.out.print(" ");
        }*/
    }
}

