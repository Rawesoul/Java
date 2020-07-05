package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите строку 1");
        Scanner in = new Scanner(System.in);
        String stroka1 = in.nextLine();
        System.out.println("Введите строку 2");
        String stroka2 = in.nextLine();

        if (stroka1.length() > stroka2.length() & stroka1.length() != stroka2.length())
        {System.out.println(stroka1);  }
        else {if (stroka1.length() < stroka2.length())  {System.out.println(stroka2); }
        else {System.out.println("Строки равны друг другу");};
        }

    }
}
