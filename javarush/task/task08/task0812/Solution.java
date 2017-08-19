package com.javarush.task.task08.task0812;

import com.sun.javafx.image.IntPixelGetter;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        int count = 1;
        int max = 1;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) == numbers.get(i + 1))
            {
                count++;
                if (max < count)
                    max = count;
            }
            else
                count = 1;
        }
        System.out.println(max);

    }
}