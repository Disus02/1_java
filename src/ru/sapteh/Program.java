package ru.sapteh;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        int[] arr4 = new int[10];
        arrRandom(arr);
        sealArr(arr);
        arrRandom(arr1);
        sealArr(arr1);
        arrRandom(arr2);
        sealArr(arr2);
        arrRandom(arr3);
        sealArr(arr3);
        arrRandom(arr4);
       sealArr(arr4);
    }
    public static int[] arrRandom(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 100) - 15);
        }
        return arr;
    }
    public static void sealArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
        System.out.println(" ");
    }
}