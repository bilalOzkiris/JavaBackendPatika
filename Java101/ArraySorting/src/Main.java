import java.util.Scanner;

public class Main {
    public static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        int el;
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Element: ");
            el = sc.nextInt();
            list[i] = el;
        }
        int[] sortedList = bubbleSort(list);
        System.out.print("Ordered list from smallest to largest: ");
        printArr(sortedList);
    }
}
