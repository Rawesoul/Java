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
        int[][] massiv = new int[NumX][NumY];
        // Вводим значения
        for (int i = 1; i < NumX+1; i++) {
            for (int j = 1; j < NumY+1; ++j) {
               System.out.println("Введите элемент строки "+i+" столбца "+j);
               massiv[i-1][j-1] = in.nextInt();
           }
        }
        System.out.println("Утроенное значение элементов первой строки равно");
        for (int j = 0; j < NumY; ++j) {
                System.out.print(" "+ massiv[0][j]*3);
            }
    }
}
