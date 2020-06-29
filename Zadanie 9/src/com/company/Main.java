package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Определяем длину массива
        System.out.println("Введите длину массива");
        Scanner in = new Scanner(System.in);
        int Num = in.nextInt();
        //Инициализируем массив
        int massiv[] = new int[Num];
        // Вводим значения
        int i = 0;
        int j = 0;
        do{
            j++;
            System.out.println("Введите значение элемента массива №="+ j);
            massiv[i] = in.nextInt();
            i++;
        } while (i!=Num);
        //Отображаем элементы массива
        j = 0;
        for (i = 0; i < Num; i++) {
            j++;
            massiv[i] = massiv[i]<<1;
            System.out.println("Удвоенное значение элемента №="+j+" массива равно "+ massiv[i]);
        }
    }
}
