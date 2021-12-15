package task._02_algorithmization.multidimensionalArray;

import task.AbstractTask;
import task.Task;

public class Task8 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("В числовой матрице поменять местами два столбца любых столбца," +
                "\nт.е. все элементы одного столбца поставить на соответствующие им позиции другого," +
                "\nа его элементы второго переместить в первый.Номера столбцов вводит пользователь с клавиатуры.");
        System.out.print("size = ");
        int size = enterInt(1, Integer.MAX_VALUE);
        System.out.print("n = ");
        int n = enterInt(0, size-1);
        System.out.print("m = ");
        int m = enterInt(0, size-1);
        int[][] arr = createMultiArray(size,size,0,9);
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
