package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Вводим курс
        System.out.println("Введите курс доллара (в рублях)");
        Scanner in = new Scanner(System.in);
        double Kurs = in.nextDouble();
        //Вводим денежную сумму
        System.out.println("Введите денежную сумму (рубли)");
        double money = in.nextDouble();
        //Вычисляем количество долларов и выводим на экран
        double Dollar = money/Kurs;
        System.out.printf("У вас "+"%.2f",Dollar);
        System.out.print(" долларов");
    }
}
