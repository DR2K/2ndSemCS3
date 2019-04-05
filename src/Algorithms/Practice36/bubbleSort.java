package Algorithms.Practice36;

import java.util.Random;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array Size  ===>>  ");
        int size = input.nextInt();
        int[] list = new int[size];
        createList(list, size);
        displayList(list);
        //bubbleSort(list);
        displayList(list);
    }


    public static void createList(int[] list, int size) {
        Random rand = new Random(1234);
        for (int k = 0; k < size; k++) {
            int rndInt = rand.nextInt(9000) + 1000;
            list[k] = rndInt;
        }
    }

    public static void displayList(int[] list) {
        for (int x : list) {
            System.out.print(x + " ");
        }
    }

    public static void bubbleSort(int[] list) {
        int lo=0;
        int hi=list.length-1;
        for (int x=0;x<list.length-1;x++)
            for (int j = 0;j<x;j++)
            {
            }

    }
}
