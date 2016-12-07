package com.shane.javauper.demos.io;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteToLocalFileMain {
    public static void main(String[] args) {
        String filename = "a.txt";

        FileOutputStream fos = null;
        Scanner sc = null;

        try {
            sc = new Scanner(System.in);
            fos = new FileOutputStream(filename);

            System.out.println("prepare to write data into " + filename);

            while (true) {
                System.out.print("please input data(quit with \"q\"):");
                String s = sc.nextLine();
                if (s.equals("q"))
                    break;

                s += "\n";
                fos.write(s.getBytes());
                fos.flush();
            }

            System.out.println("done.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fos) {
                try { fos.close(); } catch (IOException e) { e.printStackTrace(); }
            }

            if (null != sc) {
                sc.close();
            }
        }
    }
}
