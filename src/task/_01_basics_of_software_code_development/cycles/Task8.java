package task._01_basics_of_software_code_development.cycles;

import task.AbstractTask;
import task.Task;

public class Task8 extends AbstractTask implements Task {

    @Override
    public void solving() {
        System.out.println("Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");
        System.out.print("первое число ");
        int a = Math.abs(enterInt());
        System.out.print("второе число ");
        int b = Math.abs(enterInt());

        int sizeA = 0;
        for (int i = 10; a / i > 0; i *= 10) {
            sizeA++;
        }

        int sizeB = 0;
        for (int i = 10; b / i > 0; i *= 10) {
            sizeB++;
        }

        int arrSize = Math.min(sizeA, sizeB);
        Integer[] arr = new Integer[arrSize];
        int index = 0;

        for (int i = 0; i < sizeA; i++) {
            int numbI = a % 10;
            a = a / 10;
            int copyB = b;
            for (int j = 0; j < sizeB; j++) {
                int numbJ = copyB % 10;
                copyB = copyB / 10;
                if (numbI == numbJ) {
                    boolean check;
                    check = checkDuplication(arr, numbI);
                    if (check) {
                        continue;
                    }
                    arr[index] = numbI;
                    index++;
                }
            }
        }
        for (Integer integer : arr) {
            if (integer == null){
                break;
            }
            System.out.print(integer + " ");
        }
    }

    private boolean checkDuplication(Integer[] arr, int numbI) {
        for (Integer integer : arr) {
            if (integer == null) {
                break;
            }
            if (integer == numbI) {
                return true;
            }
        }
        return false;
    }
}
