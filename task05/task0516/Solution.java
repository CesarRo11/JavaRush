package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[5];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int x;
        int z;
        x = array.length;
        z= (int) Math.ceil(x/2);
        if(x%2==0){

            Arrays.fill(array, 0, z, valueStart);
            Arrays.fill(array, z, x, valueEnd);
        }else{
            Arrays.fill(array, 0, z+1, valueStart);
            Arrays.fill(array, z, x, valueEnd);
        }
        System.out.println(Arrays.toString(array));
    }
}
