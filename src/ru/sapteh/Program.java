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
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
        System.out.println(" ");
        arrRandom(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%d ",arr1[i]);
        }
        System.out.println(" ");
        arrRandom(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%d ",arr2[i]);
        }
        System.out.println(" ");
        arrRandom(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("%d ",arr3[i]);
        }
        System.out.println(" ");
        arrRandom(arr4);
        for (int i = 0; i < arr4.length; i++) {
            System.out.printf("%d ",arr4[i]);
        }
    }
    public static int[] arrRandom(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 100) - 15);
        }
        return arr;
    }
}