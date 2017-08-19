package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        int summ = 0;
        String s = Integer.toString(number); // переводим наше число в строку

        int[] sum = new int[s.length()]; // создаем массив, величина массива - это длинна нашей строки строки

        for (int i = 0; i < s.length(); i++) { // используя цикл, записываем каждый элемент строки в ячейку массива
            sum[i] = Integer.parseInt(s.substring(i, i + 1)); // прочти про подстройки - халява
        }

        for (int i = 0; i < sum.length; i++) { // цикл на получение суммы наших чисел из массива
            summ += sum[i];
        }
        return summ;
    }
}