package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        int min=0;
        int max=0;

        for (int i = 0; i < 10; i++) {
            arrayList.add(new BufferedReader(new InputStreamReader(System.in)).readLine());

            min = (arrayList.get(i).length() < arrayList.get(min).length()) ? i : min;
            max = (arrayList.get(i).length() > arrayList.get(max).length()) ? i : max;
        }

        System.out.println(min < max ? arrayList.get(min) : arrayList.get(max));

    }
}
