import java.util.Random;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        int[] arr1 = creatArray();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("bat dau: " + new Date() + "\n");
        selectionSort(arr1);
        stopWatch.end();
        System.out.println("ket thuc: " + new Date() + "\n");
        System.out.println("thoi gian thuc hien thuat toan(s): " + stopWatch.getElapsedTime());

    }

    private static int[] creatArray() {
        int[] arr = new int[100000];
        Random random = new Random(100000);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    int temp = min;
                    min = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
