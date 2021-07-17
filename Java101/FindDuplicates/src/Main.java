public class Main {
    public static int findIndex(int[][] arr, int value) {
        /*
         int idx = findIndex(arr, value);

            INPUTS;
                arr: two dimensional array
                value: int number
            OUTPUT;
                index of the value in first column of the arr.
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == value) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isIn(int[][] arr, int value) {
        /*
        boolean isIn = isIn(arr, value);

            INPUTS;
                arr: two dimensional array
                value: int number
            OUTPUT;
                Boolean value that corresponding to occurrence of value in arr
         */
        for (int[] row : arr) {
            if (row[0] == value) {
                return true;
            }
        }
        return false;
    }

    public static int[][] elementFrequenciesInAnArray(int[] arr) {
        /*
        int[][] freq = elementFrequenciesInAnArray(arr);

            INPUT;
                arr: one dimensional array
            OUTPUT;
                two dimensional array with frequency values of elements in arr
         */
        int[][] frequencies = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            if (!isIn(frequencies, arr[i])) {
                frequencies[i][0] = arr[i];
                frequencies[i][1] = 1;
            } else {
                frequencies[findIndex(frequencies, arr[i])][1] += 1;
            }
        }
        return frequencies;
    }

    public static void displayDuplicates(int[][] arr) {
        /*
        displayDuplicates(arr);
        
            INPUT;
                arr: two dimensional frequency array
            OUTPUT;
                prints elements with more than one frequency
         */
        for (int[] row : arr) {
            if (row[1] > 1) {
                System.out.println(row[0]);
            }
        }
    }

    public static void main(String[] args) {
        // array to look for duplicates
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 1, 0};
        // frequency array of list
        int[][] freqArr = elementFrequenciesInAnArray(list);
        // elements that have duplicates in list
        displayDuplicates(freqArr);
    }
}
