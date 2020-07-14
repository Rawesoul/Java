package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        //Считываем записи из файла
        System.out.println("Содержимое файла Test.txt:");
        String s;
        int kolvo = 0;
        BufferedReader BR;
        try {
            BR = new BufferedReader(new FileReader("test.txt"));
            while ((s = BR.readLine()) != null) {
                System.out.println(s);
                kolvo++;
            }}
        catch(IOException ex){ ex.printStackTrace(); }
//перезаписываем
        String str;
        BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("В считанном файле "+kolvo+" Строк.");
//Начинаем считывание с консоли и ввод в файл
        try (FileWriter fw = new FileWriter("test.txt")){
            for (int i = 1; i<kolvo+1; i++) {
                System.out.print("Введите текст строки № "+i+": ");
                str = BR.readLine();
                str = str + "\r\n";
                fw.write(str);
            }}
        catch(IOException ex){ System.out.println(ex.getMessage()); };
        System.out.println("Перезапись файла Test.txt завершена!");
    }
}
