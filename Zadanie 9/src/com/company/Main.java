package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Определяем длину массива
        System.out.println("Введите длину массива");
        Scanner in = new Scanner(System.in);
        int Num = in.nextInt();
        //Инициализируем массив
        int[] massiv = new int[Num];
        // Вводим значения
        for (int i = 1; i<Num+1; i++){
            System.out.println("Введите значение элемента массива №="+ i);
            massiv[i-1] = in.nextInt();
        };
        //Отображаем элементы массива
        for (int i = 1; i < Num+1; i++) {
            massiv[i-1] = massiv[i-1]<<1;
            System.out.println("Удвоенное значение элемента №="+i+" массива равно "+ massiv[i-1]);
        }
    }
}
