package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Введите двоичное число:");
    Scanner in = new Scanner(System.in);
    String ChisloBin = in.nextLine();
    int ChisloDec = Integer.parseInt(ChisloBin, 2);
    System.out.println("Ваше число равно:"+ChisloDec);
    }
}
