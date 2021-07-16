import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int[] minMaxByValue(int[] arr, int value) {
        int[] result = new int[2];
        Arrays.sort(arr);
        int biggerMin = arr[arr.length - 1];
        int smallerMax = arr[0];
        for (int el : arr) {
            if (el < value && el > smallerMax) {
                smallerMax = el;
            }
            if (el > value && el < biggerMin) {
                biggerMin = el;
            }
        }
        result[0] = smallerMax;
        result[1] = biggerMin;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lst = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.println("Array: " + Arrays.toString(lst));
        System.out.print("Entered number: ");
        int val = sc.nextInt();
        int[] resultArr = minMaxByValue(lst, val);
        System.out.println("The nearest number smaller than the entered number: " + resultArr[0]);
        System.out.println("The nearest number bigger than the entered number: " + resultArr[1]);

    }
}
