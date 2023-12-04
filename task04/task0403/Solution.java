package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=0;
        while(s.hasNextInt()){
        int a = s.nextInt();
        n=n+a;
        
        }
       System.out.println(n);
    }
}