package service;

import java.util.Arrays;
import java.util.Scanner;

public abstract class AbstractTask {
    protected static Scanner scanner = new Scanner(System.in);

    protected int[] getArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

    protected double[] getArray(int size, double min, double max) {
        double[] arr = new double[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

    protected int[][] getMultiArray(int i, int j, int min, int max){
        int[][] arr = new int[i][j];
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                arr[x][y] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
        return arr;
    }

    protected void printArray(int[] arr) {
        System.out.print("array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    protected void printArray(double[] arr){
        System.out.print("array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    protected void printMultiArray(int[][] arr){
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    protected void printMultiArray(double[][] arr){
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
