package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Определяем длину массива
        System.out.print("Введите длину массива");
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
        j = 0;
       // for (int i = 1; i <= Num; ++i) {
         //   System.out.println("Введите значение элемента массива №=" +i);
          //  massiv[i] = in.nextInt();
        for (i = 0; i < Num; i++) {
            j++;
            massiv[i] <<= massiv[i];
            System.out.println("Удвоенное значение элемента №="+j+" массива равно "+ massiv[i]);
        }
    }
}
