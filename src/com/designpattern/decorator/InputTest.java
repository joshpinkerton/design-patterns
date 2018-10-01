package com.designpattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;

        // FileInputStream is a concrete component (extending abstract component InputStream)
        // BufferedInputStream is a concrete decorator that extends abstract decorator FilterInputStream
        // LowerCaseInputStream is our custom concrete decorator that also extends abstract decorator FilterInputStream
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
