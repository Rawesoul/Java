package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Определяем длину массива
        System.out.println("Сортировка прямым выбором\nВведите длину массива");
        Scanner in = new Scanner(System.in);
        int Num = in.nextInt();
        //Инициализируем массив
        int[] massiv = new int[Num];
        // Вводим значения
        for (int i = 1; i < Num + 1; i++) {
            System.out.println("Введите значение элемента массива №=" + i);
            massiv[i - 1] = in.nextInt();
        };
        //Сортируем прямым выбором
        int Nmin;
        for (int i = 0; i < massiv.length; i++) {
            //Определяем номер минимального элемент (первый в выборке)
            Nmin = i;
            //Определяем порядковый номер самого минимального элемента из оставшихся
            for (int j = i + 1; j < massiv.length; j++) {
                if (massiv[j] < massiv[Nmin]) {
                    Nmin = j;
                }
            }
            //Меняем местами минимальный элемент с первым в выборке
            int tmp = massiv[i];
            massiv[i] = massiv[Nmin];
            massiv[Nmin] = tmp;
        }
        //Выводим итоговый результат
        System.out.println("Отсортированная строка:");
        System.out.println(Arrays.toString(massiv));
    }
}
