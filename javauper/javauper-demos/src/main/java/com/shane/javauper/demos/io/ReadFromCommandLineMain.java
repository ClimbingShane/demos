package com.shane.javauper.demos.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFromCommandLineMain {
    public static void main(String[] args) {
        //ReadFromCommandLineMain.readChar();
        //ReadFromCommandLineMain.readLine();
        ReadFromCommandLineMain.readMultiType();
    }

    public static void readChar() {
        System.out.println("read char test...");

        try {
            System.out.print("wait for input:");
            int asciiValue = System.in.read();
            char chValue = (char) asciiValue;
            System.out.println(asciiValue + ":" + chValue);

            if (48 <= asciiValue && asciiValue <= 57) {
                int value = Integer.valueOf("" + chValue);
                System.out.println("value:" + value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readLine() {
        System.out.println("read line test...");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("wait for input:");
            String s = br.readLine();
            System.out.println("input:" + s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readMultiType() {
        System.out.println("read multi tyoe test...");

        Scanner scanner = new Scanner(System.in);

        System.out.print("wait for input line:");
        String s = scanner.nextLine();
        System.out.println("input:" + s);

        System.out.print("wait for input int:");
        int i = scanner.nextInt();
        System.out.println("input:" + i);

        System.out.print("wait for input double:");
        double d = scanner.nextDouble();
        System.out.println("input:" + d);
    }
}
