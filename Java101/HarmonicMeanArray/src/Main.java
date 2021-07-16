public class Main {
    static double harmonicMean(int[] arr) {
        return arr.length / harmonicSeries(arr);
    }

    static double harmonicSeries(int[] arr) {
        double harmonicSeries = 0;
        for (int i = 1; i <= arr.length; i++) {
            harmonicSeries += 1.0 / i;
        }
        return harmonicSeries;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double hMeans = harmonicMean(numbers);
        System.out.println(hMeans);
    }
}
