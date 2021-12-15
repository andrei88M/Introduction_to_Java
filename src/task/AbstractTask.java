package task;

import java.util.Scanner;

public abstract class AbstractTask {
    private final Scanner scanner = new Scanner(System.in);

    public int enterInt() {
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public int enterInt(int from, int to) {
        int numb;
        do {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
            }
            numb = scanner.nextInt();
        } while (numb < from || numb > to);
        return numb;
    }

    public String enterString() {
        return scanner.nextLine();
    }

    public String enterString(int quantityParagraph) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < quantityParagraph; i++) {
            str.append(scanner.nextLine());
            str.append("\n ");
        }
        return str.toString();
    }

    public String enterChar() {
        while (true) {
            String str = scanner.nextLine();
            if (str.length() == 1) {
                return str;
            }
        }
    }

    protected int[] createArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

    protected double[] createArray(int size, double min, double max) {
        double[] arr = new double[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

    protected int[][] createMultiArray(int i, int j, int min, int max) {
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
        System.out.println();
    }

    protected void printArray(double[] arr) {
        System.out.print("array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    protected void printMultiArray(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    protected void printMultiArray(double[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    protected boolean getBoolean(String str, int index) {
        if (str.charAt(index) == 0 ||
                str.charAt(index) == '1' ||
                str.charAt(index) == '2' ||
                str.charAt(index) == '3' ||
                str.charAt(index) == '4' ||
                str.charAt(index) == '5' ||
                str.charAt(index) == '6' ||
                str.charAt(index) == '7' ||
                str.charAt(index) == '8' ||
                str.charAt(index) == '9') {
            return true;
        }
        return false;
    }
}
