package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        //ПЕРВОЕ решение
        stroka = stroka.replaceAll("\\s+","");
        System.out.println(stroka);

        //ВТОРОЕ решение
        /*char[] massiv = stroka.toCharArray();
        for(int i = 0 ; i<stroka.length(); i++){
            if (massiv[i]!=' '){System.out.print(massiv[i]);}
        }*/
    }
}
