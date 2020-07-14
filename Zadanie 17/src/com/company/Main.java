package com.company;

import java.io.*;

import static java.io.BufferedReader.*;
import static java.io.FileWriter.*;

public class Main {

    public static void main(String[] args) {
        String str;
        BufferedReader BR;
        BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввод текста в файл.\nВведите текст построчно. Для завершения введите'стопэ'");
//Начинаем считывание с консоли и ввод в файл
        try (FileWriter fw = new FileWriter("test.txt")){
            do { System.out.print(": ");
            str = BR.readLine();
            if (str.compareTo("стопэ")==0) {break;}
            str = str + "\r\n";
            fw.write(str);
            } while (str.compareTo("стопэ")!=0);}
            catch(IOException ex){ System.out.println(ex.getMessage()); };
    }
}
