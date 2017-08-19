package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        int[] arr = new int[15];
        int oddSum = 0; //нечет
        int evenSum = 0; //чет
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
            if (i%2 == 0) evenSum += arr[i];
            else oddSum += arr[i];
        }
        System.out.println("В домах с " + (oddSum > evenSum ? "нечетными" : "четными") +
                " номерами проживает больше жителей.");
    }


    }
