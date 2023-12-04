package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        multiArray = new int[n][];
        for(int i=0; i < multiArray.length; i++){
        int j = s.nextInt();
        multiArray[i]= new int [j];

            }
    }
}
