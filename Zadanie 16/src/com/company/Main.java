package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String s;
        BufferedReader BR;
        try {
            BR = new BufferedReader(new FileReader("test.txt"));
            while ((s = BR.readLine()) != null) {
            System.out.println(s);}}
        catch(IOException ex){System.out.println(ex.getMessage()); }
    }
}
