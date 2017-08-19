package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Objects;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double count = 0;

        while(true)
        {
            double a = scanner.nextInt();
            sum+=a;
            count++;

            if(a == -1)
            {
                count--;
                sum++;
                System.out.println(sum/count);
                break;
            }
        }
    }
}

