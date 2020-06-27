package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Определяем длину матрицы
        System.out.println("Введите длину матрицы");
        Scanner in = new Scanner(System.in);
        int NumX = in.nextInt();
        //Определяем ширину матрицы
        System.out.println("Введите ширину матрицы");
        int NumY = in.nextInt();
        //Инициализируем массив
        int massiv[][] = new int[NumX][NumY];
        // Вводим значения
        int i, j, a, b;
        for (i = 0; i < NumX; ++i) {
            a = i;
            a++;
            for ( j = 0; j < NumY; ++j) {
               b = j;
               b++;
               System.out.println("Введите элемент строки "+a+" столбца "+b);
               massiv[i][j] = in.nextInt();
           }
        }
        System.out.println("Утроенное значение элементов первой строки равно");
        for (i = 0; i < 1; ++i) {
            for ( j = 0; j < NumY; ++j) {
                System.out.print(" "+ massiv[i][j]*3);
            }
            System.out.println();
        }

    }
}
