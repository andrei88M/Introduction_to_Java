package tasks._02_algorithmization.multidimensionalArray;

import service.AbstractTask;
import service.Task;

public class Task8 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("В числовой матрице поменять местами два столбца любых столбца," +
                "\nт.е. все элементы одного столбца поставить на соответствующие им позиции другого," +
                "\nа его элементы второго переместить в первый.Номера столбцов вводит пользователь с клавиатуры.");
        System.out.print("size = ");
        int size = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("m = ");
        int m = scanner.nextInt();
        int[][] arr = getMultiArray(size,size,0,9);
        printMultiArray(arr);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[n][i];
            arr[n][i] = arr[m][i];
            arr[m][i] = temp;
        }
        printMultiArray(arr);
    }
}
