package ru.zhugin.se.lesson2;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    //Начало выполнения 6 задания lesson-2
    static boolean checkBalance(int[] arr) {
        int leftSum = 0, rightSum = 0;
        for (int x = 0; x < arr.length + 1; x++) {
            leftSum = 0;
            rightSum = 0;
            for (int y = 0; y < x; y++) {
                leftSum += arr[y];
            }
            for (int y = x; y < arr.length; y++) {
                rightSum += arr[y];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }
    //Конец выполнения 6 задания lesson-2
    //Начало выполения 7 здания lesson-2
    public static int[] changesArr(int[] arr, int n){
        if (n > 0) {
            for (int x = 0; x < n; x++) {
                int z = arr[arr.length - 1];
                for (int y = arr.length - 1; y > 0; y--) {
                    arr[y] = arr[y - 1];
                }
                arr[0] = z;
            }
        } else if (n < 0) {
            for (int x = 0; x < n * (-1); x++) {
                int z = arr[0];
                for (int y = 0; y < arr.length - 1; y++) {
                    arr[y] = arr[y + 1];
                }
                arr[arr.length - 1] = z;
            }
        }
        return arr;
    }
    //Конец выполения 7 задания lesson-2
    public static void main(String[] args) {
        final String divStrip = "\n-----------------";//Разделительная полоса между заданиями.
        System.out.println(divStrip);
        System.out.print(Arrays.toString(changesArr(new int[]{10,20,30,40},1)));// результат выполения 7 задания
        System.out.println(divStrip);
        System.out.print(checkBalance(new int[]{3,3,1,3,4})); // результат проверки 6 задания
        System.out.println(divStrip);
        //Начало выполнения 1 задания lesson-2
        int[] onOffArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int x = 0; x < 10; x++) {
            if (onOffArr[x] == 0) onOffArr[x] = 1;
            else onOffArr[x] = 0;
            System.out.print((onOffArr[x]) + " ");
        }
        //Конец выполения 1 задания lesson-2
        System.out.println(divStrip);
        //Начало выполнения 2 задания lesson-2
        int[] eggSizeArr = new int[8];
        for (int x = 0, y = 0; x < 22; x += 3, y++) {
            System.out.print((eggSizeArr[y]=x) + " ");
        }
        //Конец выполения 2 задания lesson-2
        System.out.println(divStrip);
        //Начало выполения 3 задания lesson-2
        int[] priceArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int x = 0; x < priceArr.length; x++){
            if (priceArr[x] < 6) priceArr[x] = priceArr[x] * 2;
            System.out.print((priceArr[x]) + " ");
        }
        //Конец выполения 3 задания lesson-2
        System.out.println(divStrip);
        //Начало выполения 4 задания lesson-2
        int emptyShelf = 0, fullShelf = 1;
        int[][] stillageArr = new int[5][5];
        for (int x = 0; x < stillageArr.length; x++) {
            for (int y = 0; y < stillageArr.length; y++) {
                stillageArr[x][y] = emptyShelf;
                stillageArr[y][y] = fullShelf;
                System.out.print(stillageArr[x][y] + " ");
            }
            System.out.println();
        }
        //Конец выполения 4 задания lesson-2
        System.out.println(divStrip);
        //Начало выполения 5 задания lesson-2
        int[] lemonSizeArr = {10, 15, 9, 10,  25, 23, 45, 56, 1, 100, 200, 30};
        int max = lemonSizeArr[0],min = lemonSizeArr[0];
        for (int x = 1; x < lemonSizeArr.length; x++){
            if (min > lemonSizeArr[x]) min=lemonSizeArr[x];
            if (max < lemonSizeArr[x])  max=lemonSizeArr[x];
        }
        System.out.println("Минимальное значение массива:" + min);
        System.out.println("Максимальное значение массива:" + max);
        //Конец выполения 5 задания lesson-2
        System.out.println(divStrip);

        int x, sum = 0, b=0;
        int[] arr = {1,2,3};
        for (x = 0; x <arr.length; x++){
            sum = sum + arr[x];
        }

        System.out.println(sum);

    }

}
