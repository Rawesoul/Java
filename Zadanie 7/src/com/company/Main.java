package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1. Определяем константы
        byte x = 4;
        byte y = 2;
        byte z = 0;
        //2. Вводим число
        System.out.println("Сравнение с константами. Введите число:");
        Scanner in = new Scanner(System.in);
        int Number = in.nextInt();
        String message = "Данное значение имеется в константах";
        //Проверям итоговое условие
        if (Number==x) {System.out.println(message);  }
        else {   if (Number==y)
                    {System.out.println(message);}
                    else { if (Number == z)
                          {System.out.println(message); }
                                else {
            System.out.println("Такой константы нет!");
            }
        }
        }
}
}
