package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1. Вводим число и записываем в строковую переменную
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        //2. Конвертируем строку в числовую переменную
        int X = Integer.parseInt(S,10);
        //3. Конвертируем переменную int в переменную double
        double Y = X;
        // Пишем результат
        System.out.print(S+"\n"+X+"\n"+Y);

        /*
        //Переводим строку в Массив
        char[] massiv = S.toCharArray();
        //Проверяем дробное ли число введено

        boolean drobnoe = false;
        int i, X;
        for(i = 0; i<S.length(); i++){
            if (massiv[i]=='.'){drobnoe = true; break;}
        };
        */
        //Округляем если дробное, переводим напрямую в int если целочисленное
        /*
        if (drobnoe) {
            String S2 = S.substring(0, i);
            int X2 = Integer.parseInt(S2,10);
            String S3 = S.substring(i+1, i+2);
            int X3 =Integer.parseInt(S3,10);
            if (X3>4) {X = X2+1;} else { X = X2;}
        }
        else {X = Integer.parseInt(S,10);};
        */
        //
    }
}
