package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int n = 0;
        while(n<10){
            System.out.println(name+text);
            n++;
        }

    }
}
