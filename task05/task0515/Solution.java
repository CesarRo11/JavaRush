package com.javarush.task.pro.task05.task0515;

import java.util.Arrays;

/* 
Сравнение двумерных массивов
*/

public class Solution {

    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        int x;
        int z;
        x = arrayFirst.length;
        z= (int) Math.ceil(x/2);
        if(x%2==0){

            Arrays.fill(arrayFirst, 0, z, valueStart);
            Arrays.fill(arrayFirst, z, x, valueEnd);
        }else{
            Arrays.fill(arrayFirst, 0, z+1, valueStart);
            Arrays.fill(array, z+1, x, valueEnd);
        }

        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
    }
}

